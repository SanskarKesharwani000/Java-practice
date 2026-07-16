// for everything that we have to use of a class outside our package should be marked public inside that class.

package a.b.c;

import m.n.B;

class A {
    public static void main(String[] args) {
        B x = new B();

        System.out.println(x.y);
    }
}

