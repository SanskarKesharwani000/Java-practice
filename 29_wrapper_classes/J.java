class J {
    public static void main(String[] args) {
        Byte x = Byte.valueOf("abc");

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Byte.parseByte(Byte.java:193)
//         at java.base/java.lang.Byte.valueOf(Byte.java:249)
//         at java.base/java.lang.Byte.valueOf(Byte.java:275)
//         at J.main(J.java:3)