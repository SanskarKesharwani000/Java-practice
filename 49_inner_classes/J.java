class J {
    int y = 9;
    class A {
        class B {
            void process() {
                System.out.println(y);
            }
        }
    }    

    public static void main(String[] args) {
        A.B x = new J().new A().new B();

        x.process();
    }
}
