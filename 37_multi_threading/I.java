class YourThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName());
    }
}

class I {
    public static void main(String[] args) {
        YourThread t = new YourThread();
        t.setName("mohan");
        t.start();        
        
        Thread x = Thread.currentThread();
        
        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName());
    }
}
