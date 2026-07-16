class AA extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName()); 
    }
}

class Y {
    public static void main(String[] args) {
        AA a = new AA();
        a.setName("Bheem");
        // a.setDaemon(true);
        a.start();
    }    
}
