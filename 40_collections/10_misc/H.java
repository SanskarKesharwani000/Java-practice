import java.util.TreeSet;

class H {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("manjeet");
        set.add("daljeet");
        set.add("sukhvindar");
        set.add("deepak");
        set.add("tinku");
        set.add("om");
        set.add("murugan");
        set.add("kavya");

        System.out.println(set);
        
        // String str = set.floor("omprakash");
        // String str = set.floor("chetan");
        String str = set.floor("kavya");
        System.out.println(str);
    }
}
