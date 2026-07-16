import java.util.PriorityQueue;

class A {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
    
        queue.offer("satpal");
        queue.offer("gurpreet");
        queue.offer("mintu");
        queue.offer("chetan");
        queue.offer("vikram");

        System.out.println(queue);
    }
}