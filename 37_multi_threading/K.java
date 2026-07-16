class WeThread extends Thread {
    public void run(int y) {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName() + " --- run()");
    }
}

class K {
    public static void main(String[] args) {
        WeThread t = new WeThread();
        t.setName("mohan");
        t.start();    
        
        Thread x = Thread.currentThread();
        
        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName() + " --- main()");
    }
}
