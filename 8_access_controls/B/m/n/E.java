// private variable of a class is not accessible in different package through inheritance.

package m.n;

import a.b.c.A;

class E extends A {
    public static void main(String[] args) {
        E a = new E();

        System.out.println(a.y);
    }
}


// m\n\E.java:9: error: y has private access in A
//         System.out.println(a.y);
//                             ^
// 1 error