class E {
    public static void main(String[] args) {
        String x = new String("mohan");
        String y = new String("mohan");

        boolean f1 = x == y;
        boolean f2 = x.equals(y);

        System.out.println("==: " + f1);
        System.out.println("equals(): " + f2);
    }    
}
