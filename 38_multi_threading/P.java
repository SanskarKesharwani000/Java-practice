class A3Runnable implements Runnable {
    public void run() {
        synchronized(P.a) {
            Thread x = Thread.currentThread();
    
            for(int i=0;i<40;i++)
                System.out.println(i + " - " + x.getName()); 
        }
    }
}

class A4Runnable implements Runnable {
    public void run() {
        synchronized(P.b) {
            Thread x = Thread.currentThread();
    
            for(int i=0;i<40;i++)
                System.out.println(i + " - " + x.getName()); 
        }
    }
}

class P {
    static P a = new P();
    static P b = new P();
    public static void main(String[] args) {
        Thread t1 = new Thread(new A3Runnable(), "X");
        Thread t2 = new Thread(new A4Runnable(), "Y");

        t1.start();
        t2.start();
    } 
}
