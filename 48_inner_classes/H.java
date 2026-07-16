class H {
    int t = 91;

    void pro() {
        class X1 {
            void info() {
                System.out.println(t);
            }
        }

        X1 x = new X1();
        x.info();
    }    

    public static void main(String[] args) {
        H h = new H();

        h.pro();
    }
}
