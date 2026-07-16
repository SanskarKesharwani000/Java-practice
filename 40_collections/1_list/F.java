import java.util.ArrayList;

class F {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        x.add("mohan");
        x.add("rohan");
        x.add("sohan");
        x.add("gohan");
        x.add("tohan");

        System.out.println(x);

        // Cannot access element of ArrayList using subscript
        System.out.println(x[0]);
    }    
}


// F.java:15: error: array required, but ArrayList found
//         System.out.println(x[0]);
//                             ^
// Note: F.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error