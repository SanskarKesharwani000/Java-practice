class M1 { 
    synchronized void pro() {
        Thread x = Thread.currentThread();
        for(int i=0;i<30;i++) {
            try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }             
            Q.bb.info();
            System.out.println(i + " - " + x.getName());
        }    }   }
class M2 { 
    synchronized void info() {
        Thread x = Thread.currentThread();
        for(int i=0;i<30;i++) {
            try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
            Q.aa.pro();            
            System.out.println(i + " - " + x.getName());            
        }   }  }

class A1Thread extends Thread {
    public void run() {        Q.aa.pro();    }}

class A2Thread extends Thread {
    public void run() {        Q.bb.info();    }}

class Q {
    static M1 aa = new M1();
    static M2 bb = new M2();

    public static void main(String[] args) {
        A1Thread x = new A1Thread();
        x.setName("G");

        A2Thread y = new A2Thread();
        y.setName("H");
        
        x.start();
        y.start();
    }
}