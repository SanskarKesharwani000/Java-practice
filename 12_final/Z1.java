// If a local level variable is marked final then it is uninitilized and cannot be used without initializing it 

class Z1 {
    void pro() {
        final int x;
        final int y = 9;

        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Z1 a = new Z1();

        a.pro();
    }    
}


// Z1.java:6: error: variable x might not have been initialized
//         System.out.println(x);
//                            ^
// 1 error