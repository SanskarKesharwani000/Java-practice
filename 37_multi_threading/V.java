class YThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println("start - " + x.getName());
        try {
            for(int i=0;i<10;i++) {
                System.out.println(i + " - " + x.getName());
                if(i==5)
                    Thread.sleep(1000);    
            }

        } catch(InterruptedException e) {   e.printStackTrace();   }
            
        System.out.println("end - " + x.getName());
    }
}

class V {
    public static void main(String[] args) {
        YThread t = new YThread();

        t.setName("indrverma");

        t.start();

        for(int i=0;i<10;i++) {
            Thread x = Thread.currentThread();
            System.out.println(i + " - " + x.getName());
            if(i==5)
                t.interrupt();        
        }
    }
}






// start - indrverma
// 0 - indrverma
// 0 - main
// 1 - indrverma
// 1 - main
// 2 - indrverma
// 2 - main
// 3 - indrverma
// 4 - indrverma
// 3 - main
// 5 - indrverma
// 4 - main
// 5 - main
// 6 - main
// 7 - main
// 8 - main
// java.lang.InterruptedException: sleep interrupted
// 9 - main
//         at java.base/java.lang.Thread.sleep(Native Method)
//         at YThread.run(V.java:10)
// end - indrverma