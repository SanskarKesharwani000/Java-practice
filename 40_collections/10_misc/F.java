import java.util.TreeSet;
import java.util.SortedSet;

class F {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("manjeet");
        set.add("daljeet");
        set.add("sukhvindar");
        // set.add("tinku");
        set.add("murugan");
        set.add("kavya");

        System.out.println(set);

        // SortedSet<String> x = set.tailSet("lion");
        SortedSet<String> x = set.tailSet("tinku");
        System.out.println(x);
    }
}
