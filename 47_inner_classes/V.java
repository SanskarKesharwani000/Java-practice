class V {
    static int y = 11;

    class X1 {
        static void process() {
            System.out.println(y);
        }
    }
    
    public static void main(String[] args) {
        X1.process();
    }
}