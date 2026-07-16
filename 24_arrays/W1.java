class W1 {
    public static void main(String[] args) {
        char a = 'A';
        byte b = 23;
        short c = 45;
        int d = 89;
        long e = 78889789789798L;
        float f = 3.4e34f;
        double g = 3.4e120;

        int[] x = {a, b, c, d, e, f, g};

        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);
    }    
}




// W1.java:11: error: incompatible types: possible lossy conversion from long to int
//         int[] x = {a, b, c, d, e, f, g};
//                                ^
// W1.java:11: error: incompatible types: possible lossy conversion from float to int
//         int[] x = {a, b, c, d, e, f, g};
//                                   ^
// W1.java:11: error: incompatible types: possible lossy conversion from double to int
//         int[] x = {a, b, c, d, e, f, g};
//                                      ^
// 3 errors
