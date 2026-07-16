class O1 {
    public static void main(String[] args) {
        int[][] x = new int[3][];
    
        // for(int i=0;i<x.length;i++) {
        //     System.out.println(x[i].length);
        // }

        x[0] = new int[3];
        x[1] = new int[5];
        x[2] = new int[2];

        for(int i=0;i<x.length;i++) {
            System.out.println(x[i].length);
        }

    }    
}
