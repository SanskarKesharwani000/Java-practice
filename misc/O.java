class O {
    public static void main(String[] args) {
        int a = 45;  // decimal integer literal
        int b = 045;  // octal integer literal
        // int b = 0o45;  // not ok
        int c = 0X45;  // hexadecimal integer literal
        int d = 0B110011; // binary integer literal

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}