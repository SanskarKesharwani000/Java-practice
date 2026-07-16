class BRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println(x.getName());
        System.out.println(x.getThreadGroup().getName());
        System.out.println(x.getThreadGroup().getParent().getName());
    }
}

class I {
    public static void main(String[] args) {
        BRunnable r = new BRunnable();

        ThreadGroup tg = new ThreadGroup("Dholakpur");

        Thread x = new Thread(tg, r, "Bheem");

        x.start();
    }    
}
