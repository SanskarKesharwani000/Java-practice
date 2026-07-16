import java.util.TreeSet;
import java.util.SortedSet;

class E {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("manjeet");
        set.add("daljeet");
        set.add("sukhvindar");
        // set.add("chetan");
        set.add("murugan");
        set.add("kavya");

        System.out.println(set);

        // SortedSet<String> x = set.headSet("naman");
        SortedSet<String> x = set.headSet("chetan");
        System.out.println(x);
    }
}
