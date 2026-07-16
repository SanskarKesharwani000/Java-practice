class GRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}

class Y {
    public static void main(String[] args) throws InterruptedException {
        Thread x = new Thread(new GRunnable(), "ABC");
        x.start();

        x.join(10);

        Thread t = Thread.currentThread();
        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}