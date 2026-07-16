class G3Thread extends Thread {
    public void run() {
        L.t1.pro();
    }
}

class G4Thread extends Thread {
    public void run() {
        L.t2.info();
    }
}

class L {
    static Y2 t1 = new Y2();
    static Y2 t2 = new Y2();

    public static void main(String[] args) {
        G3Thread a = new G3Thread();
        G4Thread b = new G4Thread();
    
        a.setName("X");
        b.setName("Y");

        a.start();
        b.start();
    }    
}

class Y2 {
    synchronized static void pro() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }

    synchronized static void info() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}
