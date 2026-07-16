import java.util.ArrayList;

class B1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(45);
        x.add(23);

        System.out.println(x);

        Integer v = (Integer)x.get(1);

        System.out.println(v);
    }
}
