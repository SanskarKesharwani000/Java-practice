// private variable of a class is not accessible in different package through instantiation.

package m.n;

import a.b.c.A;

class D {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.y);
    }
}


// m\n\D.java:9: error: y has private access in A
//         System.out.println(a.y);
//                             ^
// 1 error