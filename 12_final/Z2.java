// a local level variable is marked final when it is not initialized.

class Z2 {
    void pro() {
        final int x;

        x = 11;

        System.out.println(x);
    }

    public static void main(String[] args) {
        Z2 a = new Z2();

        a.pro();
    }    
}
