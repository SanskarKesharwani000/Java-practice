import java.util.PriorityQueue;

class J {
    public static void main(String[] args) {
        PriorityQueue<Student1> queue = new PriorityQueue<Student1>();

        queue.offer(new Student1("karan", 12));
        queue.offer(new Student1("naman", 9));
        queue.offer(new Student1("safal", 16));
        queue.offer(new Student1("vinay", 10));
        queue.offer(new Student1("sajal", 5));

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
