class PQ {
    void pro() {
        final int y = 999;
        class A {
            static void info() {
                System.out.println(y);
            }
        }

        A a = new A();
        a.info();
    }   
    
    public static void main(String[] args) {
        PQ z = new PQ();
        
        z.pro();
    }
}
