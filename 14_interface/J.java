// Since interface does not contain constructor so we cannot create object of that class.

interface J1 {

}

class J {
    public static void main(String[] args) {
        J1 a = new J1();    
    }    
}



// J.java:7: error: J1 is abstract; cannot be instantiated
//         J1 a = new J1();
//                ^
// 1 error