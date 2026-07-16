// We can access static method of that class from the class name of that class.

class J {
    public static void main(String[] args) {
        J1.pro();
    }    
}

class J1 {
    static void pro() {
        System.out.println("Namaskaram");
    }
}