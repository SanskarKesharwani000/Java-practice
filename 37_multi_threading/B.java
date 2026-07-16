class B {
    public static void main(String[] args) {
        System.out.println("----------- start");
        
        Thread x = Thread.currentThread();
        System.out.println("Current Thread Name: " + x.getName());
        System.out.println("Current Thread Id: " + x.getId());
        System.out.println("Current Thread Priority: " + x.getPriority());
        
        System.out.println("----------- end");
    }
}