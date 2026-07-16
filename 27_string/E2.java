class E2 {
    public static void main(String[] args) {
        String x = "U5 \n#~y\u00a";

        System.out.println(x);
    }    
}



// E2.java:3: error: illegal unicode escape
//         String x = "U5 \n#~y\u00a";
//                                  ^
// 1 error