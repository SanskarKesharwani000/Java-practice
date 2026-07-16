class G {
    void pro() {
        class X1 {
            private void info() {
                System.out.println("Hiiiii...");
            }
        }

        X1 a = new X1();
        a.info();
    }    

    public static void main(String[] args) {
        G f = new G();

        f.pro();
    }
}
