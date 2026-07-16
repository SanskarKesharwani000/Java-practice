class D {
    static void pro(int[] x) {
        System.out.println(x.length);
    }
    
    public static void main(String[] args) {
        // int[] y = {12};
        // int[] y = {12, 13};
        int[] y = {12, 13, 14};
        
        // ok
        pro(y);

        // not ok
        pro(12, 13, 14);
    }    
}
