// input: <No Input>, om, 2, 3, 0, 1

class O4 {
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
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOBE");
        } catch(NumberFormatException e) {
            System.out.println("NFE");
        } 
        // catch(ArithmeticException e) {
        //     System.out.println("AE");
        // }
        finally {
            System.out.println("Essential Code...");
        }

        System.out.println("--------- end");
    }
}