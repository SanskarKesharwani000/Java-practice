class C {
    static class A {
        static class B {
            static class D {
                static class E {
                    void process() {

                    }
                }
            }
        }
    }    

    public static void main(String[] args) {
        A.B.D.E x = new A.B.D.E();
        
        x.process();
    }
}
