class F {
    int y = 3;
    class G extends Z2 {
        int y = 2;
        void process() {
            int y = 1;
            System.out.println(y);
            System.out.println(this.y);
            System.out.println(super.y);
            System.out.println(F.this.y);
        }
    }    

    public static void main(String[] args) {
        F f = new F();
        G g = f.new G();

        g.process();
    }
}

class Z2 {
    int y = 99;
}