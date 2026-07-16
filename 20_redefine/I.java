class I1 {
    int n = 67;
}

class I extends I1 {
    // int n = 45;

    void abc() {
        // int n = 90;
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        I x = new I();
        
        x.abc();
    }
}
