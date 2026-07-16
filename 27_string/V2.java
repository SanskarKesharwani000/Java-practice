class V2 {
    public static void main(String[] args) {
        String x = "that guy is om and om is my best friend... om is in class 12th";

        String[] y = x.split("om", 3);

        for(String next : y)
            System.out.println(">" + next + "<");

        System.out.println("+++++++++++++++++");

        System.out.println(x);
    }    
}
