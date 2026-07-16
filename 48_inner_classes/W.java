class W {
    static int y = 56;

    class A {

    }   
    
    static class B {

    }

    public static void main(String[] args) {
        
        B b1 = new B();
        B b2 = new W.B();

        // A a = new A(); // not ok

        W w = new W();
        A a = w.new A();
        A b = new W().new A();

        // B b3 = w.new B(); //not ok
    }
}
