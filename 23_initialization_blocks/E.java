class E {
    // All instance block runs in order.
    {
        System.out.println("Hello 1");
    }
    
    E() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        System.out.println("main start");

        E x = new E();

        System.out.println("main end");
    }

    {
        System.out.println("Hello 2");
    }
}
