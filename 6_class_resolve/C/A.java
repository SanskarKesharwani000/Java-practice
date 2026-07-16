// If class name will no matched with file name so that class will never be accessible as compiler checks the class with their class names.

class A {
    public static void main(String[] args) {
        B a = new B();

        System.out.println(a.y);
    }
}

// class B {
//     int y = 2;
// }




// A.java:3: error: cannot find symbol
//         B a = new B();
//         ^
//   symbol:   class B
//   location: class A
// A.java:3: error: cannot find symbol
//         B a = new B();
//                   ^
//   symbol:   class B
//   location: class A
// 2 errors