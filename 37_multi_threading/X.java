class BThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0;i<40;i++)   
            System.out.println(i + " - " + t.getName()); 
    }
}

class CThread extends Thread {
    public void run() {
        BThread x = new BThread();
        x.setName("Jaggu");
        x.start();

        try { x.join(); } catch(InterruptedException e) { e.printStackTrace(); }

        Thread t = Thread.currentThread();
        for(int i=0;i<40;i++)   
            System.out.println(i + " - " + t.getName()); 
    }
}

class X {
    public static void main(String[] args) {
        CThread x = new CThread();
        x.setName("Raju");
        x.start();

        try { x.join(); } catch(InterruptedException e) { e.printStackTrace(); }

        Thread t = Thread.currentThread();
        for(int i=0;i<40;i++)   
            System.out.println(i + " - " + t.getName());         
    }
}
