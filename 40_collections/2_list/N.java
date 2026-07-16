import java.util.LinkedList;

class N {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.offer("mohan");
        list.offer("dinesh");
        list.offer("sudheer");
        list.offer("manjeet");
        list.offer("prabhakar");

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        // System.out.println(list.poll());

        System.out.println(list);
    }
}
