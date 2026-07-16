class W {
    public static void main(String[] args) {
        char a = 'A';
        byte b = 23;
        short c = 45;
        int d = 89;
        
        int[] x = {a, b, c, d};

        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);
    }    
}
