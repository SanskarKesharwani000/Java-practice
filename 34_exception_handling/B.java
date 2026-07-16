class B {
    public static void main(String[] args) {
        System.out.println("----- start");

        try {
            int y = 12/0;
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("----- end");
    }    
}

// output:
// ----- start
// java.lang.ArithmeticException: / by zero
//         at R.main(R.java:6)
// ----- end