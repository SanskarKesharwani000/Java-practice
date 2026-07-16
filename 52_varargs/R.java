class R {
    static void pro(int... x) {
        
    } 

    static void pro(Integer... x) {
        
    } 

    public static void main(String[] args) {
        pro(12, 13, 14);
    }    
}

// R.java:11: error: reference to pro is ambiguous
//         pro(12, 13, 14);
//         ^
//   both method pro(int...) in R and method pro(Integer...) in R match
// 1 error
