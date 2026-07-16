// input: 2, 3, 4, 6, 0, 1

class H {
    public static void main(String[] args) {
        System.out.println("--------- start");

        try {
            int a = Integer.parseInt(args[0]);
            int x = 12 / a;
            System.out.println(x);
        } catch(ArithmeticException e) {
            System.out.println("Problem...");
        }

        System.out.println("--------- end");
    }
}