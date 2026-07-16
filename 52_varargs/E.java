class E {
    // static void pro(int[] w) {
    static void pro(int... w) {   // variable number of integer arguments can be passed to such method...
        System.out.println(w.length);
    }

    public static void main(String[] args) {
        pro();

        pro(12);
        pro(12, 13);
        pro(12, 13, 14);
        pro(12, 13, 14, 15);

        int[] x = {12, 13, 14, 15, 16, 17, 18};
        pro(x);
    }    
}
