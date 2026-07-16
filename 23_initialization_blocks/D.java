class D {
    // runs before constructor
    {
        System.out.println("Hello");
    }
    
    D() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        System.out.println("main start");

        D x = new D();

        System.out.println("main end");
    }
}
