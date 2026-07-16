class B {
    public static void main(String[] args) {
        Character a = new Character('a');

        byte x1 = 12;
        Byte b = new Byte(x1);

        short x2 = 34;
        Short c = new Short(x2);

        Integer d = new Integer(23);

        Long e = new Long(34);

        Float f = new Float(2.3f);

        Double g = new Double(3.4);
    }    
}


// B.java:3: warning: [removal] Character(char) in Character has been deprecated and marked for removal
//         Character a = new Character('a');
//                       ^
// B.java:6: warning: [removal] Byte(byte) in Byte has been deprecated and marked for removal
//         Byte b = new Byte(x1);
//                  ^
// B.java:9: warning: [removal] Short(short) in Short has been deprecated and marked for removal
//         Short c = new Short(x2);
//                   ^
// B.java:11: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer d = new Integer(23);
//                     ^
// B.java:13: warning: [removal] Long(long) in Long has been deprecated and marked for removal
//         Long e = new Long(34);
//                  ^
// B.java:15: warning: [removal] Float(float) in Float has been deprecated and marked for removal
//         Float f = new Float(2.3f);
//                   ^
// B.java:17: warning: [removal] Double(double) in Double has been deprecated and marked for removal
//         Double g = new Double(3.4);
//                    ^
// 7 warnings
