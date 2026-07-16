class T1 {
    private T1() {

    }

    static T1 getInstance() {

        //some code...
        
        T1 tmp = new T1();
        
        return tmp;
    }
}

class T {
    public static void main(String[] args) {
        
        T1 x = T1.getInstance();
    }
}

