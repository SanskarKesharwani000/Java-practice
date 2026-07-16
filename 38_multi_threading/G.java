class E1Thread extends Thread {
    public void run() {
        G.a.pro();
    }
}

class F1Thread extends Thread {
    public void run() {
        G.b.info();
    }
}

class G {
    static X2 a = new X2();
    static X2 b = new X2();

    public static void main(String[] args) {
        E1Thread t1 = new E1Thread();
        F1Thread t2 = new F1Thread();

        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();
    }    
}

class X2 {
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
