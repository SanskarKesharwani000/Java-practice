import java.util.ArrayList;

class C {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(45);
        x.add(23);

        System.out.println(x);

        Integer v = x.get(1);

        System.out.println(v);
    }
}
