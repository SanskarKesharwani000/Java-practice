class Z {
    public static void main(String[] args) {
        // long x = Long.parseLong("345");
        long x = Long.parseLong("345788L");

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "345788L"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Long.parseLong(Long.java:711)
//         at java.base/java.lang.Long.parseLong(Long.java:836)
//         at Z.main(Z.java:4)