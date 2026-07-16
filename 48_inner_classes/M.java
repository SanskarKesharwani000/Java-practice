class M {
    int aa = 99;
    static int bb = 55;

    void pro() {        
        class X1 {
            void info() {
                System.out.println(aa);
                System.out.println(bb);
            }
        }

        X1 x = new X1();
        x.info();
    }   
    
    public static void main(String[] args) {
        M m = new M();
        m.pro();
    }
}