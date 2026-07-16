import java.util.PriorityQueue;

class E {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
 
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        
        queue.offer(56);
        queue.offer(67);
        queue.offer(23);
        queue.offer(37);
        queue.offer(12);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}