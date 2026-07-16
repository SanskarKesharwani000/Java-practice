// We can create object of implemented subclass of abstract class 

abstract class I2 {
    abstract void pro();
}

class I1 extends I2 {
    void pro() {
        System.out.println("Namaskar");
    }
}

class I {
    public static void main(String[] args) {
        // I2 a = new I2();

        I1 a = new I1();
        a.pro();
    }
}