class EThread extends Thread {
    public void run() {
        F.a.pro();
    }
}

class FThread extends Thread {
    public void run() {
        F.b.info();
    }
}

class F {
    static X1 a = new X1();
    static X1 b = new X1();

    public static void main(String[] args) {
        EThread t1 = new EThread();
        FThread t2 = new FThread();

        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();
    }    
}

class X1 {
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
