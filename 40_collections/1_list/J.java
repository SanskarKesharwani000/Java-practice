import java.util.ArrayList;

class J {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("hitesh");
        x.add("ritesh");
        x.add("gitesh");
        x.add("mitesh");
        x.add("kitesh");
        x.add("yamraj");

        // In this every record is Object so method of string cannot be called 
        for(Object str : x) {
            System.out.println(str.toUpperCase());
        }
    }
}


// J.java:15: error: cannot find symbol
//             System.out.println(str.toUpperCase());
//                                   ^
//   symbol:   method toUpperCase()
//   location: variable str of type Object
// Note: J.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
