class BThread extends Thread {
    public void run() { 
        Thread x = Thread.currentThread();

        for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " going to withdraw... ");
            
            C.x.withdraw(10);
            System.out.println(x.getName() + " withdrawal completed... current balance: " + C.x.getBalance());
        }
    }
}

class C {
    static Account2 x = new Account2();

    public static void main(String[] args) {
        BThread t1 = new BThread();
        BThread t2 = new BThread();
        
        t1.setName("Gopal");
        t2.setName("Shreepal");
        
        t1.start(); 
        t2.start(); 
    }
}
