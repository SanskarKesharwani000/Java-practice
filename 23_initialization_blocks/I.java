class I {

    {
        System.out.println("~step 1");      
        System.out.println("~step 2");      
        System.out.println("~step 3");
        // ...      
        System.out.println("`step 50");
    }

    I() {
        this(12);      
        System.out.println("I()");      
    }    

    I(int y) {
        this("om");   
        System.out.println("I(int)");      
    } 

    I(String x) {   
        System.out.println("I(String)");      
    }    

    public static void main(String[] args) {
        System.out.println("main start");
        I x = new I();
        System.out.println("main end");
    }
}
 