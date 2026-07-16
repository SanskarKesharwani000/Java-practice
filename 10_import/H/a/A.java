// If two classes in different package  of same name are used then we have to import second when it is used with import on the same line where it is used

package a;

import x.B;
import x.y.B;

class A {
    public static void main(String[] args) {
        
    }
}


// a\A.java:4: error: a type with the same simple name is already defined by the single-type-import of B
// import x.y.B;
// ^
// 1 error