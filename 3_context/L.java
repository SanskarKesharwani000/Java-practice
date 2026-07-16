// Static variable and static method can be accessed from the class name

class L {
    static int y = 9;

    public static void main(String[] args) {
        System.out.println(L.y);

        L.pro();
    }   
    
    static void pro() {
        System.out.println("Hello");
    }
}
