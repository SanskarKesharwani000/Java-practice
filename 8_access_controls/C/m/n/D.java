// In default access control variable y is not accessible outside the package structure through inheritance or instantiation.

package m.n;

import a.b.c.A;

class D {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.y);
    }
}


// m\n\D.java:9: error: y is not public in A; cannot be accessed from outside package
//         System.out.println(a.y);
//                             ^
// 1 error

