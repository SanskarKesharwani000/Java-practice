class W2 extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println(x.getName() + " ~ Before: " + W1.t.getName() + " - " + W1.t.isAlive());

        for(int i=0;i<30;i++)
            System.out.println(i + " - " + x.getName());

        System.out.println(x.getName() + " ~ After: " + W1.t.getName() + " - " + W1.t.isAlive());
    }
}

class W1 {
    static Thread t;
    public static void main(String[] args) {
        t = Thread.currentThread();

        W2 x = new W2();
        x.setName("Raju");
        x.start();
        
        for(int i=0;i<10;i++) {
            if(i>7)
                try { Thread.sleep(1); } catch(InterruptedException e) { e.printStackTrace();}
            System.out.println(i + " - " + t.getName() + " main()");
        }
    }    
}
