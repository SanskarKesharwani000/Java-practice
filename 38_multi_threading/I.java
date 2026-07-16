class E3Thread extends Thread {
    public void run() {
        I.a.pro();
    }
}

class F3Thread extends Thread {
    public void run() {
        I.a.info();
    }
}

class I {
    static X4 a = new X4();

    public static void main(String[] args) {
        E3Thread t1 = new E3Thread();
        F3Thread t2 = new F3Thread();

        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();
    }    
}

class X4 {
    synchronized void pro() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }

    synchronized void info() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}
