import java.util.TreeSet;

class D {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("manjeet");
        set.add("daljeet");
        set.add("sukhvindar");
        set.add("murugan");
        set.add("kavya");

        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
    }
}
