class L {
    public static void main(String[] args) {
        @SuppressWarnings("removal")
        Integer x = new Integer(32);

        System.out.println(x);

        Float y = new Float(2.3);

        System.out.println(y);
    }    
}


// L.java:8: warning: [removal] Float(double) in Float has been deprecated and marked for removal
//         Float y = new Float(2.3);
//                   ^
// 1 warning