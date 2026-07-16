class E4 {
    public static void main(String[] args) {
        // String x = "U5 \N#~y\u00a0"; //not ok
        String x = "U5 \\N#~y\u00a0"; //ok

        System.out.println(x);

    }    
}
