class A1Runnable implements Runnable {
    public void run() {
        synchronized(O.q) {
            Thread x = Thread.currentThread();
    
            for(int i=0;i<40;i++)
                System.out.println(i + " - " + x.getName()); 
        }
    }
}

class A2Runnable implements Runnable {
    public void run() {
        O.q.pro();
    }
}

class O {
    static O q = new O();
    public static void main(String[] args) {
        Thread t1 = new Thread(new A1Runnable(), "X");
        Thread t2 = new Thread(new A2Runnable(), "Y");

        t1.start();
        t2.start();
    }    

    synchronized void pro() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName()); 
    }
}
