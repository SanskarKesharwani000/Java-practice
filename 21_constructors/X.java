class X1 {
    int q;

    void abc() {
        
    }

    X1(int y) {

    }
}

class X extends X1 {
    static int n = 12;
    
    X() {
        super(n);
    }    

    public static void main(String[] args) {
        new X();
    }
}
