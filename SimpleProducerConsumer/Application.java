

package SimpleProducerConsumer;

public class Application {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(10);
        Producer producer1 = new Producer(sharedResource, "p1");
        Producer producer2 = new Producer(sharedResource, "p2");

        Consumer consumer1 = new Consumer(sharedResource, "c1");
        Consumer consumer2 = new Consumer(sharedResource, "c2");

        Thread pt1 = new Thread(producer1);
        Thread pt2 = new Thread(producer2);
        Thread ct1 = new Thread(consumer1);
        Thread ct2 = new Thread(consumer2);

        pt1.start();
        pt2.start();
        ct1.start();
        ct2.start();

    }
}