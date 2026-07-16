// In default access control variable y is accessible only in same package through instantiation and inheritance both.

package a.b.c;

class C extends A {
    public static void main(String[] args) {
        C a = new C();

        System.out.println(a.y);
    }
}

