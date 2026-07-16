class AThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0;i<40;i++)   
            System.out.println(i + " - " + t.getName()); 
    }
}

class W {
    public static void main(String[] args) {
        AThread x = new AThread();
        x.setName("Golu");
        x.start();

        Thread t = Thread.currentThread();
        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + t.getName()); 
            if(i==19)
                try { x.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        }  
    }
}