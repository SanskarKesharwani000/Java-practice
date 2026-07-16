class T3 {
    public static void main(String[] args) {
        // Byte, Short, Integer and Long
        // Constant Pool Range: -128 ----- 0 ----- 127
        Long x = 128L;
        Long y = 128L;        

        Long a = 127L;
        Long b = 127L;

        System.out.println(x == y);
        System.out.println(a == b);
    }    
}
