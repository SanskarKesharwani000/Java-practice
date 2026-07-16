class V {
    public static void main(String[] args) {
        Short x = Short.valueOf("567", 2);

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "567" under radix 2
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Short.parseShort(Short.java:137)
//         at java.base/java.lang.Short.valueOf(Short.java:193)
//         at V.main(V.java:3)