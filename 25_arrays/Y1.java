class Y1 {
    public static void main(String[] args) {
        int[] x = {12, 34, 56};
        int[][] y = {{1,2},{2,3}};
        int[][][] z = {{{1,2},{2,3}},{{1,2},{2,3}}};

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
    }    
}
