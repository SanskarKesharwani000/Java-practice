class MyThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println("+++++ start ++++++" + x.getId() + "+++++++++++");
        
        System.out.println(x);
        
        System.out.println("+++++ end ++++++" + x.getId() + "+++++++++++");
    }
}

class H {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
                
        MyThread y1 = new MyThread();
        y1.start();
        
        MyThread y2 = new MyThread();
        y2.start();
        
        MyThread y3 = new MyThread();
        y3.start();

        System.out.println(x);
    }    
}
