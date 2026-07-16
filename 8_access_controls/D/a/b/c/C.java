// protected member is accessible in same package through inheritance.

package a.b.c;

class C extends A {
    public static void main(String[] args) {
        C a = new C();

        System.out.println(a.y);
    }
}

