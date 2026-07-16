class N1 {
    public static void main(String[] args) {
        // String x = "vikramaditya";
        String x = "vishwanathananand";

        // System.out.println(x.indexOf('a', 0));        
        // System.out.println(x.indexOf('a', 5));        
        // System.out.println(x.indexOf('a', 7));
        
        int index = x.indexOf('a');

        while(index != -1) {
            System.out.println(index + " ~");
            index = x.indexOf('a', index+1);
        }
    }    
}
