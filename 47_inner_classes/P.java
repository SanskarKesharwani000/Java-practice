class P {
    int w = 97;

    class X1 {
        private void process() {
            System.out.println(w + " ++++");
        }
    }
    
    public static void main(String[] args) {
        P o = new P();

        X1 x = o.new X1();

        x.process();
    }
}
