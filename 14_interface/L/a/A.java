package a;

import x.B;

class A {
    public static void main(String[] args) {
        B b;
    }
}


// a\A.java:3: error: B is not public in x; cannot be accessed from outside package
// import x.B;
//         ^
// a\A.java:7: error: B is not public in x; cannot be accessed from outside package
//         B b;
//         ^
// 2 errors