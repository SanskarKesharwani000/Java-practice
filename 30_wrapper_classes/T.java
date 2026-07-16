class T {
    public static void main(String[] args) {
        // Byte, Short, Integer and Long
        // Constant Pool Range: -128 ----- 0 ----- 127
        Integer x = 128;
        Integer y = 128;

        Integer a = 127;
        Integer b = 127;

        System.out.println(x == y);
        System.out.println(a == b);
    }    
}
