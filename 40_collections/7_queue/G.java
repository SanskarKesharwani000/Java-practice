import java.util.Iterator;
import java.util.PriorityQueue;

class G {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
         
        queue.offer(56);
        queue.offer(67);
        queue.offer(23);
        queue.offer(37);
        queue.offer(12);

        System.out.println(queue);
        
        Iterator<Integer> itr = queue.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        System.out.println(queue);
    }
}