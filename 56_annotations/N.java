class N {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        // @SuppressWarnings("removal")
        Integer x = new Integer(32);

        System.out.println(x);

        // @SuppressWarnings("removal")
        Float y = new Float(2.3);

        System.out.println(y);
    }
    

    public void process() {
        Integer x = new Integer(32);

        System.out.println(x);

        Float y = new Float(2.3);

        System.out.println(y);
    }
}



// N.java:17: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(32);
//                     ^
// N.java:21: warning: [removal] Float(double) in Float has been deprecated and marked for removal
//         Float y = new Float(2.3);
//                   ^
// 2 warnings