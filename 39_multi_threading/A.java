class BB extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<10;i++)
            System.out.println(i + " - " + x.getName()); 
    }
}

class A {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
        x.setDaemon(true);
        
        BB a = new BB();
        a.setName("Bheem");
        a.start();

        for(int i=0;i<40;i++) {
            // try { Thread.sleep(1); } catch(InterruptedException e) { e.printStackTrace(); } 
            System.out.println(i + " - " + x.getName()); 
        }
    }    
}


// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.setDaemon(Thread.java:1414)
//         at A.main(A.java:13)

