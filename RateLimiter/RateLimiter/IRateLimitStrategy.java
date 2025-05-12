package RateLimiter;

public interface IRateLimitStrategy {
    public boolean allow(String identifier);
}