class G5Thread extends Thread {
    public void run() {
        M.t1.pro();
    }
}

class G6Thread extends Thread {
    public void run() {
        M.t2.info();
    }
}

class M {
    static Y3 t1 = new Y3();
    static Y3 t2 = new Y3();

    public static void main(String[] args) {
        G5Thread a = new G5Thread();
        G6Thread b = new G6Thread();
    
        a.setName("X");
        b.setName("Y");

        a.start();
        b.start();
    }    
}

class Y3 {
    synchronized static void pro() {
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
