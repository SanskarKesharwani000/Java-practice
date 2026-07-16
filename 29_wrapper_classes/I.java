class I {
    public static void main(String[] args) {
        Byte x = Byte.valueOf("128");

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10
//         at java.base/java.lang.Byte.parseByte(Byte.java:195)
//         at java.base/java.lang.Byte.valueOf(Byte.java:249)
//         at java.base/java.lang.Byte.valueOf(Byte.java:275)
//         at I.main(I.java:3)
