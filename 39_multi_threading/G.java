class CThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println("Thread Name: " + x.getName());
        System.out.println("Thread Group Name: " + x.getThreadGroup().getName());
    }
}

class G {
    public static void main(String[] args) {
        CThread t = new CThread();

        t.setName("Golu");

        t.start();
    }
}
