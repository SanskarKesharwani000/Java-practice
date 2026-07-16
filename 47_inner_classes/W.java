class W {
    class X1 {
        static int u = 90;
    }   
    
    public static void main(String[] args) {
        System.out.println(X1.u);

        new J1().process();
    }
}

class J1 {
    void process() {
        System.out.println(W.X1.u);
    }
}
