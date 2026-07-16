class ARunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName());
    }
}

class O {
    public static void main(String[] args) {
        ARunnable r = new ARunnable();
        
        Thread t = new Thread(r);

        t.setName("Golu");

        t.start();
    }    
}
