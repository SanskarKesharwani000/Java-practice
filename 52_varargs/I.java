class I {
    static void pro(int... x) {
        for(int next : x) {
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        byte a = 90;
        char b = 'A';
        short c = 23000;

        long d = 23L;
        float e = 3.4f;
        double f = 34.9;

        pro(12, a, b, c, d, e, f);
    }    
}



// I.java:17: error: method pro in class I cannot be applied to given types;
//         pro(12, a, b, c, d, e, f);
//         ^
//   required: int[]
//   found:    int,byte,char,short,long,float,double
//   reason: varargs mismatch; possible lossy conversion from long to int
// 1 error