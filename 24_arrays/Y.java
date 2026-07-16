class Y {
    public static void main(String[] args) {
        byte x = 23;

        int y = x;

        System.out.println(y);

        int[] w = new byte[2];
    }    
}


// Y.java:9: error: incompatible types: byte[] cannot be converted to int[]
//         int[] w = new byte[2];
//                   ^
// 1 error