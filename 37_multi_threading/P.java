class BRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName());
    }
}

class P {
    public static void main(String[] args) {
        BRunnable r = new BRunnable();
        
        Thread t = new Thread(r);

        t.setName("Golu");

        t.start();

        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName());
    }    
}
