abstract class FF {
    abstract void pro();
}

// class GG extends FF {
//     void pro() {
//         System.out.println("Hi");
//     }
// }

class R1 {
    public static void main(String[] args) {
        FF x = new FF() {            
            void pro() {
                System.out.println("Jay");
            }
        };

        x.pro();
    }
}
