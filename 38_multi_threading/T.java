class A1Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
                
        for(int i=0;i<30;i++) {
            synchronized(T.class) {
                try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + t.getName());
            }    
        }
    }
}

class A2Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
    
        for(int i=0;i<30;i++) {
            synchronized(T.class) {
                try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + t.getName()); 
            }
        }
    }
}

class T {
    public static void main(String[] args) {
        Thread x = new Thread(new A1Runnable(), "U");
        Thread y = new Thread(new A2Runnable(), "V");

        x.start();
        y.start();
    }    
}
