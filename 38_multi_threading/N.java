class HThread extends Thread {
    public void run() { 
        Thread x = Thread.currentThread();

        for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " going to withdraw... ");
            
            N.x.withdraw(10);
            System.out.println(x.getName() + " withdrawal completed... current balance: " + N.x.getBalance());
        }
    }
}

class N {
    static Account5 x = new Account5();

    public static void main(String[] args) {
        HThread t1 = new HThread();
        HThread t2 = new HThread();
        
        t1.setName("Gopal");
        t2.setName("Shreepal");
        
        t1.start(); 
        t2.start(); 
    }
}
