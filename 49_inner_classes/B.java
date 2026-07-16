class B {
    int y = 15;
    class A1 {
        int y = 745;
        class A2 {
            int y = 45;
            class A3 {
                int y = 135;
                void info() {
                    int y = 255;
                    System.out.println(y);
                    System.out.println(this.y);
                    System.out.println(A2.this.y);
                    System.out.println(A1.this.y);
                    System.out.println(B.this.y);
                }        
            }
        }
    }    

    public static void main(String[] args) {
        B x = new B();

        A1 a = x.new A1();
        A1.A2 b = a.new A2();
        A1.A2.A3 c = b.new A3();
    
        c.info();
    }
}
