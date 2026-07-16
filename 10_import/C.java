// It is necessary to import every class in our file which we are using of outside package.

import java.io.File;

class C {
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



// C.java:5: error: cannot find symbol
//     static Date b;
//            ^
//   symbol:   class Date
//   location: class C
// C.java:6: error: cannot find symbol
//     static DateFormat c;
//            ^
//   symbol:   class DateFormat
//   location: class C
// C.java:7: error: cannot find symbol
//     static ArrayList d;
//            ^
//   symbol:   class ArrayList
//   location: class C
// 3 errors