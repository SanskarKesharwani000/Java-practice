class AThread extends Thread {
    public void run() {
        BThread x = new BThread();
        x.setDaemon(false);
        System.out.println(x.isDaemon());
    }
}

class BThread extends Thread {
    public void run() {

    }
}



class C {
    public static void main(String[] args) throws InterruptedException  {
        AThread x = new AThread();
        x.setName("Golu");
        x.setDaemon(true);
        x.start();

        Thread.sleep(1000); 
    }    
}
