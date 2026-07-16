interface N1 {
    int add(int a, int b);
}

// class N2 implements N1 {
//     public int add(int x, int y) {
//         int sum = 0;
//         sum = x + y;
//         return sum;
//     }
// }

// (x, y) -> {
//     int sum = 0;
//     sum = x + y;
//     return sum;
// }

class N {
    public static void main(String[] args) {
        // N1 x = new N2();

        N1 x = (a, b) -> {
                    int sum = 0;
                    sum = a + b;
                    return sum;
                };

        int res = x.add(23, 27);

        System.out.println(res);
    }
}
