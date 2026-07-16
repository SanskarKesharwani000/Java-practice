class L {
    class X {

    }   
    
    public static void main(String[] args) {
        X x = new L().new X();

        // or

        L z = new L();
        X t = z.new X();
    }
}
