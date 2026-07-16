class IThread extends Thread {
    public void run() {
        
    }
}

class L {
    public static void main(String[] args) {
        IThread t = new IThread();

        t.start();

        t.start(); // IllegalThreadStateException    
    }
}



// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:802)
//         at L.main(L.java:12)