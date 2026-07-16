class R {
    public static void main(String[] args) {
        int[] x1 = new int[] {12, 45, 67};
        int[] x2 = {12, 45, 67};

        int[][] y1 = new int[][]{{12, 34, 56, 78, 90}, {11, 2, 34}, {89, 56, 23}};
        int[][] y2 = {{12, 34, 56, 78, 90, 56, 97}, {11, 2, 34}, {89, 23}};
    
        for(int[] next : y2) {
            for(int nx : next) {
                System.out.print(nx + " ");
            }
            System.out.println();
        }
    }    
}
