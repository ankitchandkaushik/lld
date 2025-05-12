package SimpleProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

// this whole class can be removed using blocking queue
//https://chatgpt.com/c/67f86c7e-7470-800d-a3a0-d021d47aa53c follow this convesation for good explanation

public class SharedResource {
    Queue<Integer> buffer;
    int size;

    public SharedResource (int size) {
        this.size = size;
        this.buffer = new LinkedList<>();
    }

    public synchronized void produce(int item)  throws InterruptedException{
        while(buffer.size() == size) {
            System.out.println("Buffer full waiting");
            wait();
        }
        buffer.offer(item);
        System.out.println("Producer item " + item);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException{
        while(buffer.isEmpty()) {
            System.out.println("Buffer is empty");
            wait();
        }
        int item = buffer.poll();
        System.out.println("Consumer " + item);
        notifyAll();
        return item;
    }
}