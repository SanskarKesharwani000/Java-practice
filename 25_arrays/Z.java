class Z {
    public static void main(String[] args) {
        int[] x = {12, 34, 56};
        int[][] y = {{1,2},{2,3}};
        int[][][] z = {{{1,2},{2,3}},{{1,2},{2,3}}};

        System.out.println(x instanceof int[]);
        // System.out.println(y instanceof int[]); //not ok
        System.out.println(y instanceof int[][]);
        // System.out.println(z instanceof int[][]); //not ok
        System.out.println(z instanceof int[][][]);
    }    
}
