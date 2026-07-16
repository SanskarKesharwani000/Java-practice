// In default access control variable y is accessible only in same package through instantiation and inheritance both.

package a.b.c;

class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y); 
    }
}

