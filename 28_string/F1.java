class F1 {
    public static void main(String[] args) {
        String x = new String("mohan");
        String y = new String("MOHAN");

        boolean f1 = x == y;
        boolean f2 = x.equals(y);
        boolean f3 = x.equalsIgnoreCase(y);

        System.out.println(x + " - " + y);
        System.out.println("==: " + f1);
        System.out.println("equals(): " + f2);
        System.out.println("equalsIgnoreCase(): " + f3);
    }    
}
