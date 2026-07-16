class M {
    public static void main(String[] args) {
        String x = "   vikramprabhat  ".trim()
                                        .replace("vikram","naman")
                                        .substring(3,9)
                                        .toUpperCase();

        System.out.println(x);
    }    
}
