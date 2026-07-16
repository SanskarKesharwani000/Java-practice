class E {
    public static void main(String[] args) {
        System.out.println("--------- start");

        try {
            int x = 12 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Problem...");
        }

        System.out.println("--------- end");
    }
}