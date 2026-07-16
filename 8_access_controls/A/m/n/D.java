// public class access in different package through instantiation.

package m.n;

import a.b.c.A;

class D {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.y);
    }
}