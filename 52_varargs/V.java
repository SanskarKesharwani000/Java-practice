class V {
    V(int... e) {
        for(int next : e)
            System.out.print(next + " ");
        
        System.out.println();
    }   
    
    public static void main(String[] args) {
        V x1 = new V();
        V x2 = new V(12);
        V x3 = new V(12, 13);
        V x4 = new V(12, 13, 14);
        V x5 = new V(new int[] {12, 13, 14, 15});
    }
}
