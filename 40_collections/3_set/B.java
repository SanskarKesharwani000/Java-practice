import java.util.HashSet;

class B {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.add("golu");
        set.add("bablu");
        set.add("dablu");
        set.add("raju");
        set.add("jaggu");

        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}