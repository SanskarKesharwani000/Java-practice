class T {
    public static void main(String[] args) {
        Short x = Short.valueOf("33000");

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"33000" Radix:10
//         at java.base/java.lang.Short.parseShort(Short.java:139)
//         at java.base/java.lang.Short.valueOf(Short.java:193)
//         at java.base/java.lang.Short.valueOf(Short.java:219)
//         at T.main(T.java:3)