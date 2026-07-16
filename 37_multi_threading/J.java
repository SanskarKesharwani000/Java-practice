class OurThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName() + " --- run()");
    }
}

class J {
    public static void main(String[] args) {
        OurThread t = new OurThread();
        t.setName("mohan");
        // t.start();        
        t.run();        
        
        Thread x = Thread.currentThread();
        
        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName() + " --- main()");
    }
}
