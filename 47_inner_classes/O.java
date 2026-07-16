class O {
    int w = 34;

    class X1 {
        void process() {
            System.out.println(w);
            info();
        }
    }   

    void info() {
        System.out.println(w);
    }

    {
        System.out.println(w);
    }

    O() {
        System.out.println(w);
    }
    
    public static void main(String[] args) {
        O o = new O();

        X1 x = o.new X1();

        x.process();
    }
}
