class R1 {
    public static void main(String[] args) {
        float a = 4.5f;

        int[] x = new int[a];

        System.out.println(x.length);
    }    
}


// R1.java:5: error: incompatible types: possible lossy conversion from float to int
//         int[] x = new int[a];
//                           ^
// 1 error