// In this way we can use both classes of same name with different package.

package a;

import x.y.B;
// import x.B;

class A {
    public static void main(String[] args) {
        B a = new B();

        System.out.println(a.u);

        x.B b = new x.B();
        // this is ok
        System.out.println(b.u);
    }
}
