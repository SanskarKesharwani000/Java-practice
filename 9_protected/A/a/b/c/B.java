// protected member is accessible in same package through instantiation.

package a.b.c;

class B {
    public static void main(String[] args) {
        A x = new A();
        x.pro();
    }    
}
