import java.util.HashSet;

class C {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("golu");
        set.add("bablu");
        set.add("dablu");
        set.add("raju");
        set.add("jaggu");

        System.out.println(set);

        // String str = new String("jaggu");
        String str = new String("sattu");
        System.out.println(set.remove(str));

        System.out.println(set);
    }
}