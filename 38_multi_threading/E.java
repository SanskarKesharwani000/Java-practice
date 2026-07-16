class DThread extends Thread {
    public void run() { 
        Thread x = Thread.currentThread();

        for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " going to withdraw... ");
            
            if(E.x.getBalance() >= 10) {
                try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace();}
                E.x.withdraw(10);
            }
            System.out.println(x.getName() + " withdrawal completed... current balance: " + E.x.getBalance());
        }
    }
}

class E {
    static Account4 x = new Account4();

    public static void main(String[] args) {
        DThread t1 = new DThread();
        DThread t2 = new DThread();
        
        t1.setName("Gopal");
        t2.setName("Shreepal");
        
        t1.start(); 
        t2.start(); 
    }
}
