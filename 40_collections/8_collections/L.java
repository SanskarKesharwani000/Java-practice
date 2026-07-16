import java.util.ArrayList;
import java.util.Collections;

class L {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(95);
        list.add(12);
        list.add(78);
        list.add(49);
        list.add(12);
        list.add(7);
        // list.add(12);

        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);

        int index = Collections.binarySearch(list, 12);
    
        System.out.println(index);
    }
}