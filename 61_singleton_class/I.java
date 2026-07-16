class I1 {
    private I1() {

    }

    I1 process() {
        return new I1();
    }
}

class I {
    public static void main(String[] args) {
        I1 x = ?.process();  // ? => I1-object

        System.out.println(x == y);
    }
}
