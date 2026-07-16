// protected variable in a class is only accessible in same package with both instantiation and inheritance , but for outside the package it is accessible only through inheritance , if any class tries to access inherited class through instantiation so it's not possible to use it. 

package x.y;

class X {
    public static void main(String[] args) {
        E x = new E();

        x.pro();
    }    
}


// x\y\X.java:7: error: pro() has protected access in A
//         x.pro();
//          ^
// 1 error