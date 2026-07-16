class R {
    public static void main(String[] args) {
        long a = 6L;

        int[] x = new int[a];

        System.out.println(x.length);
    }    
}


// R.java:5: error: incompatible types: possible lossy conversion from long to int
//         int[] x = new int[a];
//                           ^
// 1 error