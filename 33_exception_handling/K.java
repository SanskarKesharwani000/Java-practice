// input: <No Input>, 3  // Exception unhandled
// input: om, 2, 0, 1

class K {
    public static void main(String[] args) {
        System.out.println("--------- start");

        try {
            int i = Integer.parseInt(args[0]);
            System.out.println("----- 1");
            
            int[] x = {2, 0, 3};

            int a = x[i];
            System.out.println("----- 2");
            
            int y = 12 / a;
            System.out.println("----- 3");
            System.out.println(y);
        } catch(NumberFormatException e) {
            System.out.println("NFE");
        } catch(ArithmeticException e) {
            System.out.println("AE");
        }

        System.out.println("--------- end");
    }
}


// --------- start
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at K.main(K.java:8)
