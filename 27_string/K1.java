class K1 {
    public static void main(String[] args) {
        String x = "ram";

        System.out.println(x.charAt(0));
        System.out.println(x.charAt(1));
        System.out.println(x.charAt(2));
        System.out.println(x.charAt(3));
    }    
}


// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 3
//         at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//         at java.base/java.lang.String.charAt(String.java:1519)
//         at K1.main(K1.java:8)