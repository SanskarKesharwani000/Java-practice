class M {
    public static void main(String[] args) {
        // Byte x = Byte.valueOf("111", 2);
        // Byte x = Byte.valueOf("111", 8);
        // Byte x = Byte.valueOf("273", 8);
        Byte x = Byte.valueOf("148", 8);

        System.out.println(x);
    }
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "148" under radix 8
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Byte.parseByte(Byte.java:193)
//         at java.base/java.lang.Byte.valueOf(Byte.java:249)
//         at L.main(L.java:6)