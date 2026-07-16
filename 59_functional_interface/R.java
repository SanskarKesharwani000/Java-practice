abstract class R1 {
    abstract void pro();
}

// class R2 extends R1 {
//     void pro() {
//         System.out.println("Helloooooo");
//     }
// }

// () -> System.out.println("Helloooooo");

class R {
    public static void main(String[] args) {
        // R1 x = new R2();
        R1 x = () -> System.out.println("Helloooooo");;

        x.pro();
    }
}
