class G {

    static void process() {
        System.out.println("-step 1");      
        System.out.println("-step 2");      
        System.out.println("-step 3");
        // ...      
        System.out.println("-step 50");
    }

    G() {
        process();
        // System.out.println("step 1");      
        // System.out.println("step 2");      
        // System.out.println("step 3");
        // // ...      
        // System.out.println("step 50");      
        System.out.println("other code");      
    }    

    G(int y) {
        process();
        // System.out.println("step 1");      
        // System.out.println("step 2");      
        // System.out.println("step 3");  
        // // ...      
        // System.out.println("step 50");    
        System.out.println("some other code");      
    }    

    G(String y) {
        process();
        // System.out.println("step 1");      
        // System.out.println("step 2");      
        // System.out.println("step 3");  
        // // ...      
        // System.out.println("step 50");    
        System.out.println("some more code");      
    }    

    public static void main(String[] args) {
        G x = new G();
        System.out.println("===================");
        G y = new G(12);
        System.out.println("===================");
        G z = new G("om");
        
        System.out.println("==========x=========");
        process();
        System.out.println("==========x=========");
        process();
        System.out.println("==========x=========");
        process();
    }
}
