class AThread extends Thread {
    public void run() {
        BThread x = new BThread();
        System.out.println(x.isDaemon());
    }
}

class BThread extends Thread {
    public void run() {

    }
}



class B {
    public static void main(String[] args) throws InterruptedException  {
        AThread x = new AThread();
        x.setName("Golu");
        x.setDaemon(true);
        x.start();

        Thread.sleep(1000); 
    }    
}
