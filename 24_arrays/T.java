class T {
    public static void main(String[] args) {
        // Negative array size exception
        int[] x = new int[-1];

        System.out.println(x.length);
    }    
}


// Exception in thread "main" java.lang.NegativeArraySizeException: -1
//         at T.main(T.java:3)