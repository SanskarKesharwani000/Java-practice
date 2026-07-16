import java.util.HashSet;

class D {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("golu");
        set.add("bablu");
        set.add("dablu");
        set.add("raju");
        set.add("jaggu");

        System.out.println(set);

        // String str = new String("bablu");
        String str = new String("mukesh");
        System.out.println(set.contains(str));

        System.out.println(set);
    }
}