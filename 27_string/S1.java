class S1 {
    public static void main(String[] args) {
        String x = "mohanjodaro";

        for(int i=x.length(); (i = x.lastIndexOf('o', i-1)) != -1; System.out.println(i+" #"));
    }    
}
