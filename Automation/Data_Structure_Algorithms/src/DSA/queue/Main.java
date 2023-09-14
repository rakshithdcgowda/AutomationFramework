package DSA.queue;

public class Main {

    public static void main(String[] args)
    {
        Queue qe=new Queue(5);

        qe.getFirst();
        qe.getLast();
        qe.getLength();

        qe.enQueue(4);
        qe.enQueue(6);
        qe.enQueue(3 );


       System.out.println(qe.deQueue().value);
        System.out.println("After Dequeue");


        qe.printQueue();
    }
}
