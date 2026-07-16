class A {
    class B {
        class C {
            class D {
                class E {

                }
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        
        B x = a.new B();

        B.C q = x.new C();

        B.C.D w = q.new D();

        B.C.D.E r = w.new E();

        System.out.println(a);
        System.out.println(x);
        System.out.println(q);
        System.out.println(w);
        System.out.println(r);
    }
}