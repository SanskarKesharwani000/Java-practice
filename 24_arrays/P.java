// array contains a length property which is final so cannot update it 

class P {
    public static void main(String[] args) {
        int[] x = new int[37];

        System.out.println(x.length);

        x.length = 23;

        System.out.println(x.length);
    }    
}


// P.java:7: error: cannot assign a value to final variable length
//         x.length = 23;
//          ^
// 1 error