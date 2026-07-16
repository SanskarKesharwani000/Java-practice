package a;

import x.B;

class A {
    public static void main(String[] args) {
        B.aaa();
    }
}



// ccc() in D ---- start
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at z.D.ccc(D.java:6)
//         at y.C.bbb(C.java:7)
//         at x.B.aaa(B.java:7)
//         at a.A.main(A.java:7)