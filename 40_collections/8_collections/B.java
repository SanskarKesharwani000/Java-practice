import java.util.ArrayList;
import java.util.Collections;

class B {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Saravan");
        list.add("Deepak");
        list.add("Jagdeesh");
        list.add("Mayank");
        list.add("Tinku");
        list.add("Amit");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
