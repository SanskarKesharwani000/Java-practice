interface Q2 {
    void pro();
}

class T {
    int a = 2;
    private int b = 5;

    Q2 y = new Q2() {
        public void pro() {
            System.out.println(a);
            System.out.println(b);
        }
    };

    public static void main(String[] args) {
        T t = new T();
        t.y.pro();
    }
}
