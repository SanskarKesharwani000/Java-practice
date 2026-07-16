class AThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println("Thread Name: " + x.getName() + " Thread Id: " + x.getId() + " Thread Priority: " + x.getPriority());
    }
}

class N {
    public static void main(String[] args) {
        AThread t1 = new AThread();
        t1.setName("nobita");
        t1.setPriority(7);
        t1.start();
        
        AThread t2 = new AThread();
        t2.setName("doraemon");
        t2.setPriority(3);
        t2.start();
        
        AThread t3 = new AThread();
        t3.setName("giyan");
        t3.setPriority(9);
        t3.start();       
    }
}