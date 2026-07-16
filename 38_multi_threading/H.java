class E2Thread extends Thread {
    public void run() {
        H.a.pro();
    }
}

class F2Thread extends Thread {
    public void run() {
        H.a.info();
    }
}

class H {
    static X3 a = new X3();

    public static void main(String[] args) {
        E2Thread t1 = new E2Thread();
        F2Thread t2 = new F2Thread();

        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();
    }    
}

class X3 {
    void pro() {
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
