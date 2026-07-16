import java.util.Scanner;

class V {
    static Circle circle = new Circle();

    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.setName("Producer");

        Consumer consumer = new Consumer();
        consumer.setName("Consumer");

        producer.start();
        consumer.start();
    }
}

class Circle {
    int radius;   
    static Scanner sc = new Scanner(System.in);

    synchronized void readRadius() {
        if(radius != 0) {
            Thread x = Thread.currentThread();
            System.out.println(x.getName() + " Radius Read... " + radius);
            radius = 0;
            notify();
        } else {
            try {  wait(); } catch(InterruptedException e) { e.printStackTrace();  }
        }
    }

    synchronized void writeRadius() {
        if(radius == 0) {
            Thread x = Thread.currentThread();
            System.out.print(x.getName() +": Enter radius: ");
            radius = sc.nextInt();
            notify();
        } else {
            try {  wait(); } catch(InterruptedException e) { e.printStackTrace();  }
        }
    }
}

class Producer extends Thread { 
    public void run() {        
        while(true) {                        
            V.circle.writeRadius();
        }
    }
}

class Consumer extends Thread {
    public void run() {        
        while(true) {
            V.circle.readRadius();
        }
    }
}
