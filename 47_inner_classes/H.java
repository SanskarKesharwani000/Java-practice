class H {
    class T {
        T() {
            System.out.println("T()");
        }
    }   
    
    int abc = 100;

    void process() {
        System.out.println("process()");
    }

    public static void main(String[] args) {
        H x = new H();

        System.out.println(x.abc);

        x.process();

        T t = x.new T();
    }
}
