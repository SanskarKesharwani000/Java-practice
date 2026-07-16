class CThread extends Thread {
    public void run() { 
        Thread x = Thread.currentThread();

        for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " going to withdraw... ");
            
            D.x.withdraw(10);
            System.out.println(x.getName() + " withdrawal completed... current balance: " + D.x.getBalance());
        }
    }
}

class D {
    static Account3 x = new Account3();

    public static void main(String[] args) {
        CThread t1 = new CThread();
        CThread t2 = new CThread();
        
        t1.setName("Gopal");
        t2.setName("Shreepal");
        
        t1.start(); 
        t2.start(); 
    }
}
