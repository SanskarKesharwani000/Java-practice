class N1 { }
class N2 { }

class T1Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
                
        synchronized(R.a) {
            for(int i=0;i<30;i++) {
                try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
                synchronized(R.b) {
                    System.out.println(i + " - " + t.getName());
                }
            }
        }
    }
}

class T2Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
    
        synchronized(R.b) {
            for(int i=0;i<30;i++) {
                try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
                synchronized(R.a) {
                    System.out.println(i + " - " + t.getName());
                }
            }
        }
    }
}

class R {
    static N1 a = new N1();
    static N2 b = new N2();

    public static void main(String[] args) {
        Thread x = new Thread(new T1Runnable(), "U");
        Thread y = new Thread(new T2Runnable(), "V");

        x.start();
        y.start();
    }    
}
