class V3 {
    public static void main(String[] args) {
        String x = "that guy is om and om is my best friend... om is in class 12th";

        String[] y = x.split("ram");

        for(String next : y)
            System.out.println(">" + next + "<");

        System.out.println("+++++++++++++++++");

        System.out.println(x);
    }    
}
