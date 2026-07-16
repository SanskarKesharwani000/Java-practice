class ERunnable implements Runnable {
    public void run() throws InterruptedException {
        Thread.sleep(23);
    }
}

class S {
    public static void main(String[] args) {
        new Thread(new ERunnable(), "Golu").start();
    }
}


// S.java:2: error: run() in ERunnable cannot implement run() in Runnable
//     public void run() throws InterruptedException {
//                 ^
//   overridden method does not throw InterruptedException
// 1 error