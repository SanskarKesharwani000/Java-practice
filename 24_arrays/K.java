class K {
    public static void main(String[] args) {
        //Case 1:
        int[] x = new int[3];

        x[0] = 34;
        x[1] = 49;
        x[2] = 73;

        for(int i=0;i<x.length;i++)
            System.out.print(x[i] + " ");

        System.out.println();    

        //Case 2:
        int[] y = new int[] {56, 78, 23, 91, 72};
        
        for(int i=0;i<y.length;i++)
            System.out.print(y[i] + " ");

        System.out.println();
        
        // Case 3:
        int[] z = {56, 78, 23, 91, 72};

        for(int i=0;i<z.length;i++)
            System.out.print(z[i] + " ");
    }    
}
