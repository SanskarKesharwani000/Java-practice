class MyThread extends Thread {
    public void run() {
        System.out.println("++++++++++++++++++++++");
        Thread x = Thread.currentThread();
        
        System.out.println(x);
        System.out.println("++++++++++++++++++++++");
    }
}

class G {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
                
        MyThread y = new MyThread();
        y.start();

        System.out.println(x);
    }    
}
