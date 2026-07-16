// here the class B is not public so it is not accessible outside it's package

package a.b.c;

import m.n.B;

class A {
    public static void main(String[] args) {
        B x;
    }
}




// a\b\c\A.java:3: error: B is not public in m.n; cannot be accessed from outside package
// import m.n.B;
//           ^
// a\b\c\A.java:7: error: B is not public in m.n; cannot be accessed from outside package
//         B x;
//         ^
// 2 errors
