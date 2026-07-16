class B {
    public static void main(String[] args) {
        System.out.println("----- start");

        int[] x = {12, 34, 56};

        System.out.println(x[3]);

        System.out.println("----- end");
    }    
}


// ----- start
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//         at B.main(B.java:7)