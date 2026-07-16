// private variable of a class is not accessible in the same package through inheritance.

package a.b.c;

class C extends A {
    public static void main(String[] args) {
        C a = new C();

        System.out.println(a.y);
    }
}



// a\b\c\C.java:7: error: y has private access in A
//         System.out.println(a.y);
//                             ^
// 1 error