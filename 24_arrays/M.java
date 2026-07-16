// In direct method we cannot initialize variable after declaration.

public class M {
    public static void main(String[] args) {
        int[] x = {12, 13};

        for(int i=0;i<x.length;i++)
            System.out.print(x[i] + " ");
        
        System.out.println("\n++++++++++++++++++++++++++");

        int[] y; 
        
        y = {12, 13, 14, 15};

        for(int i=0;i<y.length;i++)
            System.out.print(y[i] + " ");
    }    
}



// M.java:12: error: illegal start of expression
//         y = {12, 13, 14, 15};
//             ^
// M.java:12: error: not a statement
//         y = {12, 13, 14, 15};
//              ^
// M.java:12: error: ';' expected
//         y = {12, 13, 14, 15};
//                ^
// 3 errors