class N2 {
    public static void main(String[] args) {
        // String x = "vikramaditya";
        String x = "vishwanathananand";

        // solution 1:
        // System.out.println(x.indexOf('a', 0));        
        // System.out.println(x.indexOf('a', 5));        
        // System.out.println(x.indexOf('a', 7));
        
        // or

        // solution 2:
        // int index = x.indexOf('a');

        // while(index != -1) {
        //     System.out.println(index + " ~");
        //     index = x.indexOf('a', index+1);
        // }

        // solution 3:
        // int index = -1;
        // while((index=x.indexOf('a', index+1)) != -1)
        //     System.out.println(index);

        // solution 3:        
        for(int index = -1; (index=x.indexOf('a', index+1)) != -1; System.out.println(index + " ****"));
    }    
}
