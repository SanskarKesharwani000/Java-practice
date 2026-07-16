class Q {
    private int w = 123;

    class X1 {
        private void process() {
            System.out.println(w + " ++++");
        }
    }
    
    public static void main(String[] args) {
        Q o = new Q();

        X1 x = o.new X1();

        x.process();
    }
}
