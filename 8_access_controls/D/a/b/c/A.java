// protected member is only accessible in same package with instantiation and inheritance and in different package with inheritance not with instantiation

package a.b.c;

public class A {
    protected int y = 999;
}


// m\n\D.java:9: error: y has protected access in A
//         System.out.println(a.y);
//                             ^
// 1 error