import java.io.File;
import java.util.Date;

class C1 {
    static File a;
    static Date b;
    static DateFormat c;
    static ArrayList d;

    public static void main(String[] args) {
        System.out.println(a);    
        System.out.println(b);    
        System.out.println(c);    
        System.out.println(d);    
    }    
}


// C1.java:7: error: cannot find symbol
//     static DateFormat c;
//            ^
//   symbol:   class DateFormat
//   location: class C1
// C1.java:8: error: cannot find symbol
//     static ArrayList d;
//            ^
//   symbol:   class ArrayList
//   location: class C1
// 2 errors