// private variable of a class is not accessible in the same package through instantiation.

package a.b.c;

class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y); 
    }
}


// a\b\c\B.java:6: error: y has private access in A
//         System.out.println(a.y);
//                             ^
// 1 error