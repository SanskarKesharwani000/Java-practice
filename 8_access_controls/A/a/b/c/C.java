// public class accessing in same folder through inheritance.

package a.b.c;

class C extends A {
    public static void main(String[] args) {
        C a = new C();

        System.out.println(a.y);
    }
}