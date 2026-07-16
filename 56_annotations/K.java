import java.util.ArrayList;

class K {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList x = new ArrayList();

        x.add(23);
        x.add("om");

        System.out.println(x);
    }
}


// Note: J.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.