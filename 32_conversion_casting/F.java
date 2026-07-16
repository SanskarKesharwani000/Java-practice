class F {
    public static void main(String[] args) {
        System.out.println(info());
    }   
    
    static byte info() {
        return 45;  // ok
        
        // return 145;  // not ok
        
        // int a = 2;  // not ok
        // return a;
    }
}
