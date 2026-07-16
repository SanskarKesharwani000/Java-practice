package a;

import x.B;

class A {
    public static void main(String[] args) {
        System.out.println(B.y);  

        B.y = 56;

        System.out.println(B.y);  
    }
}



// a\A.java:9: error: cannot assign a value to final variable y
//         B.y = 56;
//          ^
// 1 error
