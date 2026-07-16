class D {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println(x);
        
        x.setPriority(10);

        System.out.println(x);
    }    
}
