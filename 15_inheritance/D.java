class D1 {
    void mno() {
        System.out.println("Trump");
    }
}

class D extends D1 {
    void abc() {
        System.out.println("Asim Muneer");
    }   
    
    public static void main(String[] args) {
        D x = new D();

        x.abc();

        x.mno();

        System.out.println(x.toString());

        System.out.println(x.hashCode());
    }
}
