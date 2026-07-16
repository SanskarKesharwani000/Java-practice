import java.util.PriorityQueue;

class I {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<Student>();

        queue.offer(new Student("karan", 12));
        queue.offer(new Student("naman", 9));
        queue.offer(new Student("safal", 16));
        queue.offer(new Student("vinay", 10));
        queue.offer(new Student("sajal", 5));

        System.out.println(queue);
    }
}
