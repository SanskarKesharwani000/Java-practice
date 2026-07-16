class F {
    public static void main(String[] args) {
        System.out.println("----- start");

        int[] x = {12, 34, 56};
        
        try {
            System.out.println(x[3]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem...");
        }

        System.out.println("----- end");
    }    
}