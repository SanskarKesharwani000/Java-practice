class DRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++) {
            try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace();}
            // System.out.println(i + " - " + x.getName());
        }
    }
} 

class N {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
        DRunnable r = new DRunnable();

        for(int i=0;i<4;i++) 
            new Thread(r, "A"+i).start();

        System.out.println("Default Thread's Name: " + x.getName());

        ThreadGroup tg = x.getThreadGroup();

        ThreadGroup nwTg = new ThreadGroup("QUAD");
        String[] arr = {"America", "Bharat", "Australia", "Japan"};

        for(int i=0;i<4;i++) 
            new Thread(nwTg, r, arr[i]).start();

        System.out.println("Default Thread Group: " + tg.getName());

        System.out.println("Active Thread Count: " + tg.activeCount());

        tg.list();
    }    
}
