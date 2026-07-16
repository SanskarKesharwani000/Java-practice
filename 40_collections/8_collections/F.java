import java.util.ArrayList;
import java.util.Collections;

class F {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(78);
        list.add(34);
        list.add(57);
        list.add(23);
        list.add(61);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);
    }
}