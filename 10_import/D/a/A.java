// In this example our own classes B and C are in different package so we cannot use it in our file without it's import 

package a;

// import b.B;
// import c.C;

class A {
    public static void main(String[] args) {
        B x;

        C y;
    }
}



// a\A.java:8: error: cannot find symbol
//         B x;
//         ^
//   symbol:   class B
//   location: class A
// a\A.java:10: error: cannot find symbol
//         C y;
//         ^
//   symbol:   class C
//   location: class A
// 2 errors