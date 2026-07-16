class E1 {
    public static void main(String[] args) {
        // String x = "U5 \n#~y\u00a0";
        String x = "U5 \N#~y\u00a0";

        System.out.println(x);
    }    
}


// E.java:4: error: illegal escape character
//         String x = "U5 \N#~y\u00a0";
//                         ^
// 1 error