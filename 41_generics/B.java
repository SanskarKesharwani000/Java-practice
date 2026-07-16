import java.util.ArrayList;

class B {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(45);
        x.add(23);

        System.out.println(x);

        Integer v = x.get(0);

        System.out.println(v);
    }
}
