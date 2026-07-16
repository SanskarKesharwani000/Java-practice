// Correct way to import classes which has deeper folder structure.

package a;

import b.B;
import b.c.C;

class A {
    public static void main(String[] args) {
        B x;

        C y;
    }
}


