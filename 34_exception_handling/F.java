class F {
    public static void main(String[] args) {
        System.out.println("main start");
        aaa();
        System.out.println("main end");
    }   
    
    static void aaa() {
        System.out.println("aaa start");
        bbb();
        System.out.println("aaa end");
    }
    
    static void bbb() {
        System.out.println("bbb start");
        ccc();
        System.out.println("bbb end");
    }
    
    static void ccc() {
        System.out.println("ccc start");
        int y = 12 / 0;
        System.out.println("ccc end");
    }
}
