class CRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println(x.getName());
        System.out.println(x.getThreadGroup().getName());
        System.out.println(x.getThreadGroup().getParent().getName());
    }
}

class J {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        ThreadGroup mainTG = t.getThreadGroup();

        CRunnable r = new CRunnable();

        ThreadGroup tg = new ThreadGroup(mainTG.getParent(), "Dholakpur");

        Thread x = new Thread(tg, r, "Bheem");

        x.start();
    }    
}
