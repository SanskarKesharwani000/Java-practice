class S {
    static void pro(int... x) {
        System.out.println("pro(int...)");
    } 

    static void pro(Integer... x) {
        System.out.println("pro(Integer...)");
    } 

    public static void main(String[] args) {
        pro(new int[] {12, 13, 14});
        pro(new Integer[] {12, 13, 14});
    }    
}