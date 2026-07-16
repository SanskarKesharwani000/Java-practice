import java.util.LinkedList;

class P {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.push("mohan");
        list.push("dinesh");
        list.push("sudheer");
        list.push("manjeet");
        list.push("prabhakar");

        System.out.println(list);

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

        System.out.println(list);
    }
}
