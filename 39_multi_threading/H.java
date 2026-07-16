class ARunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println(x.getName());
        System.out.println(x.getThreadGroup().getName());
    }
}

class H {
    public static void main(String[] args) {
        ARunnable r = new ARunnable();

        ThreadGroup tg = new ThreadGroup("Dholakpur");

        Thread x = new Thread(tg, r, "Bheem");

        x.start();
    }    
}
