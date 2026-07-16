class D {
    static int y = 4;
    static class A {
        static int y = 3;
        static class B {
            static int y = 2;
            void process() {
                int y = 1;
                System.out.println(y); 
                System.out.println(B.y); 
                System.out.println(A.y); 
                System.out.println(D.y); 
            }
        }
    }    

    public static void main(String[] args) {
        A.B w = new A.B();
        
        w.process();
    }
}
