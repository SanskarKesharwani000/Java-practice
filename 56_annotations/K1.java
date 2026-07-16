import java.util.ArrayList;

class K1 {
    public static void main(String[] args) {        
        ArrayList x = new ArrayList();

        @SuppressWarnings("unchecked")
        x.add(23);
        x.add("om");

        System.out.println(x);
    }
}


// K1.java:8: error: <identifier> expected
//         x.add(23);
//              ^
// 1 error