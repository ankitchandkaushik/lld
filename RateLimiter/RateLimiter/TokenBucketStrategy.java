package RateLimiter;
import java.util.concurrent.ConcurrentHashMap;;

public class TokenBucketStrategy implements IRateLimitStrategy{
    int capacity;
    int rate;
    
    ConcurrentHashMap<String, TokenBucket> userBucket = new ConcurrentHashMap<>();
    public TokenBucketStrategy(int bucketSize, int ratePerSecond) {
        this.capacity = bucketSize;
        this.rate = ratePerSecond;
    }

    public boolean allow(String identifier) {
        TokenBucket tokenBucket = userBucket.computeIfAbsent(identifier, id -> new TokenBucket(capacity, rate));
        return tokenBucket.allow();
    }

    public class TokenBucket {
        public final double capacity;
        public final int rate;
        public double currentToken;
        public long lastRefillTimestamp;

        public TokenBucket(int bucketSize, int ratePerSecond) {
            this.capacity = bucketSize;
            this.rate = ratePerSecond;
            this.currentToken = bucketSize;
            this.lastRefillTimestamp = System.nanoTime();
        }
        public boolean allow() {
            refill();
            if(currentToken >= 1) {
                currentToken--;
                return true;
            }
            return false;
        }
    
        public void refill() {
            long now = System.nanoTime();
            double tokensToAdd = ((now - lastRefillTimestamp)/1000000000.0)*rate;
            currentToken = Math.min(capacity, currentToken+tokensToAdd);
            lastRefillTimestamp = now;
        }
        
    }


}