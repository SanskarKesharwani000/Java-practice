// another class variable cannot be accessed from another class.

class A {
    public static void main(String[] args) {
        // here y is not accessible
        System.out.println(y);
    }
}

class A1 {
    int y = 99;
}


// A.java:3: error: cannot find symbol
//         System.out.println(y);
//                            ^
//   symbol:   variable y
//   location: class A
// 1 error
