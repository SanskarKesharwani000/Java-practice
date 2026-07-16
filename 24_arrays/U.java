class U {
    static int[] x;
    public static void main(String[] args) {
        System.out.println(x.length);
    }
}


// Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "U.x" is null
//         at U.main(U.java:4)