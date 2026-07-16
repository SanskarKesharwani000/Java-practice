// protected member is not accessible in different package through instantiation.

package x.y;

import a.b.c.A;

class D {
    public static void main(String[] args) {
        A x = new A();

        x.pro();
    }
}



// x\y\D.java:9: error: pro() has protected access in A
//         x.pro();
//          ^
// 1 error