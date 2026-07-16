import java.util.ArrayList;

class P {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(56);
        x.add(89);
        x.add(23);
        x.add(45);
        x.add(12);

        System.out.println(x.remove(23));
    }
}


// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 23 out of bounds for length 5
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.remove(ArrayList.java:504)
//         at P.main(P.java:13)