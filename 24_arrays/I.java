class I {
    public static void main(String[] args) {
        int[] x = new int[4];
        
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        
        System.out.println("++++++++++++++++++++++++");

        x[0] = 90;
        x[1] = 80;
        x[2] = 20;
        x[3] = 30;

        System.out.println("++++++++++++++++++++++++");

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
    }    
}
