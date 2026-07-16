class B {
    void pro() {
        class Y {
            static {
                System.out.println("Hi");
            }

            Y() {
                System.out.println("Hello");    
            }
        }

        Y y = new Y();
    }    

    public static void main(String[] args) {
        B b = new B();
        b.pro();
        B c = new B();
        c.pro();
        B d = new B();
        d.pro();
    }
}
