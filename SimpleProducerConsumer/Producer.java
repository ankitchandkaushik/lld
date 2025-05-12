package SimpleProducerConsumer;

import java.util.Random;


// instead of extending Thread implement Runnable/Callable this allows more flexibility

public class Producer implements Runnable{
    SharedResource buffer;
    Random random = new Random();
    String name;

    public Producer(SharedResource sharedResource, String name) {
        this.buffer = sharedResource;
        this.name = name;
    }

    public void run() {
        int item = 0;
        try {
            while(true) {
                Thread.sleep(random.nextInt(1000));
                buffer.produce(item++);
            }
        } catch(InterruptedException exception) {
            System.out.println("Interuppend producer " + this.name);
        }
        
    }
}
