class AThread extends Thread {
    public void run() { 
        Thread x = Thread.currentThread();

        for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " going to withdraw... ");
            try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace();}
            B.x.withdraw(10);
            System.out.println(x.getName() + " withdrawal completed... current balance: " + B.x.getBalance());
        }
    }
}

class B {
    static Account1 x = new Account1();

    public static void main(String[] args) {
        AThread t1 = new AThread();
        AThread t2 = new AThread();
        
        t1.setName("Gopal");
        t2.setName("Shreepal");
        
        t1.start(); 
        t2.start(); 
    }
}
