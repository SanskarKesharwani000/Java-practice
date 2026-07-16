class L1 {
    public static void main(String[] args) {
        @SuppressWarnings("removal")
        Integer x = new Integer(32);

        System.out.println(x);

        @SuppressWarnings("removal")
        Float y = new Float(2.3);

        System.out.println(y);
    }    
}