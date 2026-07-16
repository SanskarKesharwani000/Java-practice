import java.util.ArrayList;

class Z1 {
    public static void main(String[] args) {
        // Integer typesafe ArrayList.
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(2);
        x.add(5);
        x.add(9);

        System.out.println(x);
        
        x.add(4, 7);
        System.out.println(x);
    }
}


// [2, 5, 9]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 3
//         at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
//         at java.base/java.util.ArrayList.add(ArrayList.java:481)
//         at Z1.main(Z1.java:12)