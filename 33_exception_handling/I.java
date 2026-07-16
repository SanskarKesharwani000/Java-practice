// input: <No Input>, om, 2, 3, 0, 1

class I {
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
        } catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("--------- end");
    }
}