class P {
    public static void main(String[] args) {
        int[][] x = new int[3][];
    
        x[0] = new int[3];
        x[1] = new int[5];
        x[2] = new int[2];

        x[0][0] = 34;
        x[0][1] = 56;
        x[0][2] = 89;
        
        x[1][0] = 5;
        x[1][1] = 7;
        x[1][2] = 2;
        x[1][3] = 9;
        x[1][4] = 6;

        x[2][0] = 71;
        x[2][1] = 22;

        for(int i = 0;i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
