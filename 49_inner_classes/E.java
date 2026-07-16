class E {
    int y = 3;
    class A /*extends Z1*/ {
        // int y = 2;
        void process() {
            // int y = 1;
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        E e = new E();
        
        A x = e.new A();

        x.process();
    }
}

class Z1 {
    int y = 99;
}