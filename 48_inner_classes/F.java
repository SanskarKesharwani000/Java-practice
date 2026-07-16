class F {
    void pro() {
        class X1 {
            void info() {
                System.out.println("Hello...");
            }
        }

        X1 a = new X1();
        a.info();
    }    

    public static void main(String[] args) {
        F f = new F();

        f.pro();
    }
}
