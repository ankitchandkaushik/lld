package SimpleProducerConsumer;

import java.util.Random;

public class Consumer implements Runnable {
    SharedResource buffer;
    String name;
    Random  random = new Random();

    public Consumer(SharedResource sharedResource, String name) {
        this.buffer =sharedResource;
        this.name = name;
    }

    public void run() {
        
        try {
            while(true) {
                Thread.sleep(random.nextInt(1000));
                int item = buffer.consume();
                System.out.println(this.name + " Consumer item" + item);
            }
        } catch (InterruptedException e) {
            System.out.println("Caught interrupted exception for consumer " + this.name);
        }
    }
}
