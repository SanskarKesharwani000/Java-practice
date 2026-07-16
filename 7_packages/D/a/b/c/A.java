// In this example if we do not create a constructor in class B so default constructor created by the compiler will be marked same as class. and if we create it so it will be of default access control

package a.b.c;

import m.n.B;

class A {
    public static void main(String[] args) {
        B x = new B();
    }
}

