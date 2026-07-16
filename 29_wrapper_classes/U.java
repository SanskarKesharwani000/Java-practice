class U {
    public static void main(String[] args) {
        Short x = Short.valueOf("abc");

        System.out.println(x);
    }    
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Short.parseShort(Short.java:137)
//         at java.base/java.lang.Short.valueOf(Short.java:193)
//         at java.base/java.lang.Short.valueOf(Short.java:219)
//         at U.main(U.java:3)