class H1 {
    public static void main(String[] args) {

        Animal b = new Cat();

        // b.bbb();
        b.aaa();

        Cat x = (Cat)b;

        x.bbb();
        x.aaa();
    }
}