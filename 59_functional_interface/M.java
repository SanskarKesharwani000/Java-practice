interface M1 {
    int pro();
}

// class M2 implements M1 {
//     public int pro() {
//         return 199;
//     }
// }

// () -> 199;

class M {
    public static void main(String[] args) {
        // M1 x = new M2();

        M1 x = () -> 45;

        System.out.println(x.pro());
    }
}
