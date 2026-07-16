class B {
    public static void main(String[] args) {
        int x = Integer.parseInt("45", 2);

        System.out.println(x);
    }
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "45" under radix 2
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at B.main(B.java:3)
