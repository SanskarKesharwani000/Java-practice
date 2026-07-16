class H {
    // Legal Method Overloading... (Parameter-Body Must Mismatch)
    // No rules regarding return-types and access controls...
    public void pro() {
        System.out.println("Hello");
    }

    int pro(float y) {
        System.out.println("Hi");
        return 9;
    }

    protected int pro(int y) {
        System.out.println("Namaste");
        return 9;
    }    
}