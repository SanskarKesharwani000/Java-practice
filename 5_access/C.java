// static variable of first class is not accessible in another class.

class C {
    static int x = 32;
    public static void main(String[] args) {
        System.out.println(C.y);

        System.out.println(C.x);
    }
}

class C1 {
    static int y = 99;
}


// C.java:4: error: cannot find symbol
//         System.out.println(C.y);
//                             ^
//   symbol:   variable y
//   location: class C
// 1 error