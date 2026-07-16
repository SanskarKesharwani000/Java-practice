import java.util.HashSet;

class E {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(56);
        set.add(22);
        set.add(98);
        set.add(22);
        set.add(56);
        set.add(76);

        System.out.println(set);        
    }
}