class F {
    F() {
        System.out.println("step 1");      
        System.out.println("step 2");      
        System.out.println("step 3");
        // ...      
        System.out.println("step 50");      
        System.out.println("other code");      
    }    

    F(int y) {
        System.out.println("step 1");      
        System.out.println("step 2");      
        System.out.println("step 3");  
        // ...      
        System.out.println("step 50");    
        System.out.println("some other code");      
    }    

    F(String y) {
        System.out.println("step 1");      
        System.out.println("step 2");      
        System.out.println("step 3");  
        // ...      
        System.out.println("step 50");    
        System.out.println("some more code");      
    }    

    public static void main(String[] args) {
        F x = new F();
        System.out.println("===================");
        F y = new F(12);
        System.out.println("===================");
        F z = new F("om");
    }
}
