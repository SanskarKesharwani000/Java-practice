class BB extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName()); 
    }
}

class Z {
    public static void main(String[] args) {
        BB a = new BB();
        a.setName("Bheem");
        // a.setDaemon(true);
        a.start();

        Thread x = Thread.currentThread();
        for(int i=0;i<10;i++) {
            // try { Thread.sleep(1); } catch(InterruptedException e) { e.printStackTrace(); } 
            System.out.println(i + " - " + x.getName()); 
        }
    }    
}
