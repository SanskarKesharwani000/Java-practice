class T3Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
                
        synchronized(S.class) {
            for(int i=0;i<30;i++) {
                try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + t.getName());
                }    }}}

class T4Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
    
        synchronized(S.class) {
            for(int i=0;i<30;i++) {
                try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + t.getName()); 
            }
        }
    }
}

class S {
    public static void main(String[] args) {
        Thread x = new Thread(new T3Runnable(), "U");
        Thread y = new Thread(new T4Runnable(), "V");

        x.start();
        y.start();
    }    
}
