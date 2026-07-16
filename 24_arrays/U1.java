class U1 {
    static String[] x;
    public static void main(String[] args) {
        System.out.println(x[0]);
    }
}


// Exception in thread "main" java.lang.NullPointerException: Cannot load from object array because "U1.x" is null
//         at U1.main(U1.java:4)