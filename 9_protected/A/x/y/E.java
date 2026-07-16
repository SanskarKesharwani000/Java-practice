// protected member is accessible in different package through inheritance.

package x.y;

import a.b.c.A;

class E extends A {
    public static void main(String[] args) {
        // E x = new E();
        A x = new A();

        x.pro();
    }
}



// x\y\E.java:10: error: pro() has protected access in A
//         x.pro();
//          ^
// 1 error