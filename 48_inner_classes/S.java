class W1 {
    void pro() {
        System.out.println("Namaste");
    }
}

class S {
    W1 q1 = new W1() {
        void pro() {
            System.out.println("Hi");
        }
    };
    
    W1 q2 = new W1() {
        void pro() {
            System.out.println("Hello");
        }
    };

    public static void main(String[] args) {
        S t = new S();
        
        t.q1.pro();
        t.q2.pro();
    }
}
