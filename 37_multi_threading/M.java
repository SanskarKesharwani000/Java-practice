class HeThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println("Thread Name: " + x.getName() + " Thread Id: " + x.getId() + " Thread Priority: " + x.getPriority());
    }
}

class M {
    public static void main(String[] args) {
        HeThread t1 = new HeThread();
        t1.start();
        
        HeThread t2 = new HeThread();
        t2.start();
        
        HeThread t3 = new HeThread();
        t3.start();       
    }
}