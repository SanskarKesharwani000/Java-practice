// We cannot reinitialize a local level variable when it is marked final.

class Z3 {
    void pro() {
        final int x;

        x = 34;

        x = 11;

        System.out.println(x);
    }   
    
    public static void main(String[] args) {
        Z3 a = new Z3();

        a.pro();
    }
}


// Z3.java:7: error: variable x might already have been assigned
//         x = 11;
//         ^
// 1 error