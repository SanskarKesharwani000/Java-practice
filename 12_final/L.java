// A final class behaves normal as another class but only it is not inheritable
final class L1 {
    static int t = 4;
}

class L {
    public static void main(String[] args) {
        System.out.println(L1.t);

        L1.t = 43;

        System.out.println(L1.t);
    }
}
