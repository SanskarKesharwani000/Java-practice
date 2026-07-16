class AA extends Thread{
    static Thread t = Thread.currentThread();

    public void run(){
        System.out.println("static variable custom thread: " +t);
        Thread x = Thread.currentThread();
        System.out.println(t.getThreadGroup());
        System.out.println("Custom thread object: "+ x);
        System.out.println(x.getThreadGroup().getName());
    }
}

class ZA{
    static Thread t1 = Thread.currentThread();
    
    static public void main(String[] args){
        System.out.println("static variable main thread: " +t1);
        AA x = new AA();
        x.setName("mohan");
        x.start();
    }
}