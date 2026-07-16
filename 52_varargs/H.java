class H {

    static void pro(int... x) {
        for(int next : x) {
            System.out.println(next);
        }
    }
    public static void main(String[] args) {
        byte a = 90;
        char b = 'A';
        short c = 23000;

        pro(12, a, b, c);
    }    
}
