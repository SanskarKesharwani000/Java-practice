class E4Thread extends Thread {
    public void run() {
        J.a.pro();
    }
}

class F4Thread extends Thread {
    public void run() {
        J.a.info();
    }
}

class J {
    static X5 a = new X5();

    public static void main(String[] args) {
        E4Thread t1 = new E4Thread();
        F4Thread t2 = new F4Thread();

        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();
    }    
}

class X5 {
    synchronized void pro() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }

    void info() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}
