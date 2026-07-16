import java.util.ArrayList;
import java.util.Iterator;

class O1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("om");
        x.add("ram");
        x.add("shyam");
        x.add("ghanshyam");
        x.add("khatushyam");

        Iterator itr = x.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next().toUpperCase());
        }
    }
}


// O1.java:17: error: cannot find symbol
//             System.out.println(itr.next().toUpperCase());
//                                          ^
//   symbol:   method toUpperCase()
//   location: class Object
// Note: O1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
