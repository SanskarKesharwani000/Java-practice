class G1Thread extends Thread {
    public void run() {
        K.t1.pro();
    }
}

class G2Thread extends Thread {
    public void run() {
        K.t2.info();
    }
}

class K {
    static Y1 t1 = new Y1();
    static Y1 t2 = new Y1();

    public static void main(String[] args) {
        G1Thread a = new G1Thread();
        G2Thread b = new G2Thread();
    
        a.setName("X");
        b.setName("Y");

        a.start();
        b.start();
    }    
}

class Y1 {
    static void pro() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }

    static void info() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}
