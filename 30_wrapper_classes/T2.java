class T2 {
    public static void main(String[] args) {
        // Byte, Short, Integer and Long
        // Constant Pool Range: -128 ----- 0 ----- 127
        Short x = 128;
        Short y = 128;
        
        Short a = 127;
        Short b = 127;

        System.out.println(x == y);
        System.out.println(a == b);
    }    
}
