import java.util.ArrayList;

class M {
    public static void main(String[] args) {
        // ArrayList can contain different type of but cannot easily perform operation on it.
        ArrayList x = new ArrayList();

        x.add(12);
        x.add("om");
        x.add(true);
        x.add(23.56);

        System.out.println(x);
    }
}
