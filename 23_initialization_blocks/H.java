class H {

    {
        System.out.println("~step 1");      
        System.out.println("~step 2");      
        System.out.println("~step 3");
        // ...      
        System.out.println("`step 50");
    }

    H() {      
        System.out.println("other code");      
    }    

    H(int y) {   
        System.out.println("some other code");      
    }    

    H(String y) {   
        System.out.println("some more code");      
    }    

    public static void main(String[] args) {
        H x = new H();
        System.out.println("===================");
        H y = new H(12);
        System.out.println("===================");
        H z = new H("om");
    }
}
