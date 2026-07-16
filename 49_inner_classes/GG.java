//This example shows that we can create main method inside nested class.

class GG{
    static class P{
        int y = 23;
        public static void main(String[] args) {
            G g = new G();
            P p = new P();

            System.out.println(p.y);
        }
    }
}

// java GG$P