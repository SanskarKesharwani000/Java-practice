// if variable is marked final then in every constructor we have to initialized it, or error will come.

class T {
    final int y;

    T() {
        y = 9;
    }   
    
    T(int a) {
        y = 23;
    }

    T(String b) {
        // y = 123;
    }
}
