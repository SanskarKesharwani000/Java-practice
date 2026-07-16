class L {
    public static void main(String[] args) {
        String[][] y = new String[3][2];

        // for(int i=0;i<y.length;i++) {
        //     System.out.println(y[i]);
        // }

        // for(int i=0;i<y.length;i++) {
        //     System.out.println(y[i].length);
        // }

        for(int i=0;i<y.length;i++) {
            for(int j=0;j<y[i].length;j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.print("\t");
        }
    }    
}
