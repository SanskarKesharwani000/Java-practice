class A {
    void pro() {
        class X {
            X() {
                System.out.println("Hello");
            }    
        }

        X x = new X();
        System.out.println(x);
    }

    public static void main(String[] args) {
        A a = new A();

        a.pro();
    }
}