class O {
    public static void main(String[] args) {
        Byte x = Byte.valueOf("111", 16);

        System.out.println(x);
    }
}


// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"111" Radix:16
//         at java.base/java.lang.Byte.parseByte(Byte.java:195)
//         at java.base/java.lang.Byte.valueOf(Byte.java:249)
//         at O.main(O.java:3)