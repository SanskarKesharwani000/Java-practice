class C {
    public static void main(String[] args) {
        System.out.println("----- start");

        int x = Integer.parseInt("1a");

        System.out.println("----- end");
    }    
}


// ----- start
// Exception in thread "main" java.lang.NumberFormatException: For input string: "1a"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.parseInt(Integer.java:786)
//         at C.main(C.java:5)