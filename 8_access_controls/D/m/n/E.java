// protected member is accessible in different package through inheritance.

package m.n;

import a.b.c.A;

class E extends A {
    public static void main(String[] args) {
        E a = new E();

        System.out.println(a.y);
    }
}

