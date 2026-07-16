class B {
    public static void main(String[] args) {
        Integer x = 20;

        Integer y = x;

        System.out.println(x == y);

        x++;

        System.out.println(x == y);
    }
}