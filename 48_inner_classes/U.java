interface T1 {
    int e = 90;
    void info();
}

class U {
    T1 y = new T1() {
        int m = 990;
        
        public void info() {
            System.out.println("Hi");
            abc();
            System.out.println(m);
        }

        private void abc() {
            System.out.println("Hello");
        }
    };

    public static void main(String[] args) {
        U u = new U();

        u.y.info();
        // u.y.abc(); //not ok

        // System.out.println(u.y.m);  //not ok
    }
}
