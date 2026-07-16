class X {
    static void pro(int... x) {
        for(int next : x)
            System.out.println(next);
    }

    static void pro(int[] x) {
        for(int next : x)
            System.out.println(next);
    }
    
    public static void main(String[] args) {
        pro(new int[] {12, 34, 56});
    }    
}


// X.java:7: error: cannot declare both pro(int[]) and pro(int...) in X
//     static void pro(int[] x) {
//                 ^
// 1 error
