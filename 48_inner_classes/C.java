class C {
    void pro() {
        XYZ a = new XYZ();
        
        class XYZ {

        }

        // XYZ a = new XYZ();
    }    

    public static void main(String[] args) {
        C c = new C();

        c.pro();
    }
}




// C.java:3: error: cannot find symbol
//         XYZ a = new XYZ();
//         ^
//   symbol:   class XYZ
//   location: class C
// C.java:3: error: cannot find symbol
//         XYZ a = new XYZ();
//                     ^
//   symbol:   class XYZ
//   location: class C
// 2 errors
