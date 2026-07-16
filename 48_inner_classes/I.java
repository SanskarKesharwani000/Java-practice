class I {
    private int t = 911;

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
        I h = new I();

        h.pro();
    }
}
