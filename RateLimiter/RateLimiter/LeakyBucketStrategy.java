package RateLimiter;

public class LeakyBucketStrategy implements IRateLimitStrategy{



    public boolean allow(String identifier) {

    }

    public class LeakyBucket {
        int capacity;
        int currntToken;
        int rate;
        

        public LeakyBucket(int capacity, int rate) {
            this.capacity = capacity;
            currntToken = capacity;
            this.rate = rate;
        }
    }
    
}
