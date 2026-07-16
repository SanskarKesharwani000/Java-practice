class HRunnable implements Runnable {
    public void run() {
        try { Z.t2.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        Thread t = Thread.currentThread();
        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}

class IRunnable implements Runnable {
    public void run() {
        try { Z.t1.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        Thread t = Thread.currentThread();
        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}

class Z {
    static Thread t1;
    static Thread t2;

    public static void main(String[] args) {
        t1 = new Thread(new HRunnable(), "X");
        t2 = new Thread(new IRunnable(), "Y");

        t1.start();
        t2.start();

        Thread t = Thread.currentThread();
        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + t.getName());
        }
    }    
}
