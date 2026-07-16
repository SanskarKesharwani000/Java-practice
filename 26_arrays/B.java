class B {
    public static void main(String[] args) {
        // int[] x1 = {{12, 34}};
        int[][] x2 = {12, 34};
        int[][] x3 = 12;
        int[] x4 = 12;
    }    
}



// ZB.java:4: error: incompatible types: int cannot be converted to int[]
//         int[][] x2 = {12, 34};
//                       ^
// ZB.java:4: error: incompatible types: int cannot be converted to int[]
//         int[][] x2 = {12, 34};
//                           ^
// ZB.java:5: error: incompatible types: int cannot be converted to int[][]
//         int[][] x3 = 12;
//                      ^
// ZB.java:6: error: incompatible types: int cannot be converted to int[]
//         int[] x4 = 12;
//                    ^
// 4 errors