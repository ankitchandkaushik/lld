package RateLimiter;
public class Application {
    public static void main(String[] args) {
        IRateLimitStrategy rateLimitStrategy = new TokenBucketStrategy(2, 2);

        String[] users = {"U1", "U2"};

        for(String user: users) {
            Thread userThread = new Thread( () -> {
                for(int i=0; i<10; ++i) {
                    boolean allowed = rateLimitStrategy.allow(user);
                    System.out.println("For user = " + user + "request " + i + "has been " + allowed);
                    try {
                        Thread.sleep(200);
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            userThread.start();
        }
    }
}
