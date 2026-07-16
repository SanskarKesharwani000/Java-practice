class C {
    static void pro(int a, int b, int c) {

    }
    
    public static void main(String[] args) {
        // ok
        pro(12, 23, 34);


        // not ok
        // pro(12, 23);
        // pro(12, 23, 34, 45);
        
        int[] x = {12, 13, 14};
        pro(x);
    }    
}
