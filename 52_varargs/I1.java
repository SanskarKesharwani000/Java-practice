class I1 {
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

        pro(12, a, b, c, (int)d, (int)e, (int)f);
    }    
}