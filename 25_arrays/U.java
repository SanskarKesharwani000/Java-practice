class U {
    public static void main(String[] args) {
        String[][][] x = new String[2][3][4];

        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                for(int k=0;k<x[i][j].length;k++) {
                    System.out.print(x[i][j][k] + " ");    
                }
                System.out.println();
            } 
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }    
}
