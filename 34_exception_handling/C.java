class C {
    public static void main(String[] args) {
        System.out.println("----- start");

        try {
            int y = 12/0;
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----- end");
    }    
}