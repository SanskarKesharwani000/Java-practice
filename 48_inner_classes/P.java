class P {
    static int t = 9;
    void pro() {
        class Z1 {
            static void info() {
                System.out.println(t);
            }
            void abc() {
                System.out.println(t);
            }
        }

        Z1.info();
        new Z1().abc();
    }    

    public static void main(String[] args) {
        P x = new P();
        x.pro();
    }
}