class M {
    class X1 {
        X1() {
            System.out.println("X1()");
        }
    }

    void process() {
        X1 w = new X1();
        System.out.println("process()");
    }

    public static void main(String[] args) {
        M x = new M();
        
        x.process();

        System.out.println("main() end");
    }    
}
