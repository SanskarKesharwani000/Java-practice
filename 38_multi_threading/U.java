class B1Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
                
        for(int i=0;i<30;i++) {
            synchronized(U.class) {
                System.out.println(i + " - " + t.getName());
            }    
            try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class B2Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
    
        for(int i=0;i<30;i++) {
            synchronized(U.class) {
                System.out.println(i + " - " + t.getName()); 
            }
            try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class U {
    public static void main(String[] args) {
        Thread x = new Thread(new B1Runnable(), "M");
        Thread y = new Thread(new B2Runnable(), "N");

        x.start();
        y.start();
    }    
}
