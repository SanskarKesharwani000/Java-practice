class J1 {
    int n = 67;
}

class J extends J1 {
    int n = 45;

    void abc() {
        int n = 90;
        System.out.println(n);
        System.out.println(this.n);
        System.out.println(super.n);
    }
    
    public static void main(String[] args) {
        J x = new J();
        
        x.abc();
    }
}
