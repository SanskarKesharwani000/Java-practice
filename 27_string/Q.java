class Q {
    public static void main(String[] args) {
        String x = "om is in class 12th. om is a good boy. om is a singer. he lives on an island. he makes mistakes";

        for(int i=-1; (i = x.indexOf("is", i + 1))!=-1; System.out.println(i+" ~"));
    }    
}
