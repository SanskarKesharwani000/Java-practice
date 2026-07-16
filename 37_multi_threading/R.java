class DRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++) {
            try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
            System.out.println(i + " - " + x.getName());
        }
    }
}

class R {
    public static void main(String[] args) {
        DRunnable r = new DRunnable();

        Thread t1 = new Thread(r, "bheem");
        t1.start();
        
        Thread t2 = new Thread(r, "klaiya");
        t2.start();
        
        Thread t3 = new Thread(r, "raju");
        t3.start();
        
        Thread t4 = new Thread(r, "jaggu");
        t4.start();
    }    
}
