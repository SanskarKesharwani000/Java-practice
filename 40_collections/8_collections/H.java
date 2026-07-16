import java.util.ArrayList;
import java.util.Collections;

class H {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(95);
        list.add(12);
        list.add(78);
        list.add(49);
        list.add(7);

        System.out.println(list);

        // int index = Collections.binarySearch(list, 78);
        // int index = Collections.binarySearch(list, 49);
        int index = Collections.binarySearch(list, 7);
    
        System.out.println(index);
    }
}