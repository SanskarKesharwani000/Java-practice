import java.util.TreeSet;

class G {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("manjeet");
        set.add("daljeet");
        set.add("sukhvindar");
        set.add("tinku");
        set.add("murugan");
        set.add("kavya");

        System.out.println(set);

        
        // String str = set.ceiling("murugan");
        // String str = set.ceiling("naman");
        String str = set.ceiling("yaman");
        System.out.println(str);
    }
}
