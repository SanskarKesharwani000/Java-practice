// without importing anything from different package we cannot use it.

class B {
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




// B.java:2: error: cannot find symbol
//     static File a;
//            ^
//   symbol:   class File
//   location: class B
// B.java:3: error: cannot find symbol
//     static Date b;
//            ^
//   symbol:   class Date
//   location: class B
// B.java:4: error: cannot find symbol
//     static DateFormat c;
//            ^
//   symbol:   class DateFormat
//   location: class B
// B.java:5: error: cannot find symbol
//     static ArrayList d;
//            ^
//   symbol:   class ArrayList
//   location: class B
// 4 errors