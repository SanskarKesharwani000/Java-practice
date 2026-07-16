class C {
    // runs when constructor is called before constructor.
    {
        System.out.println("Hello");
    }    

    public static void main(String[] args) {
        System.out.println("main start");

        C x1 = new C();
        C x2 = new C();
        C x3 = new C();

        System.out.println("main end");
    }
}
