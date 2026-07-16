class A {
    public static void main(String[] args) throws InterruptedException {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + x.getName());
            if(i==19)
                x.join();
        }
    }
}