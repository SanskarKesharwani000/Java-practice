class F {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println(x.getPriority());

        x.setPriority(Thread.MIN_PRIORITY);

        System.out.println(x.getPriority());
    }    
}
