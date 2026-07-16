class K {
    public static void main(String[] args) {
        Number[] x = new Number[5];

        x[0] = new Double(34.56e3);
        x[1] = new Integer(12);
        x[2] = new Float(2.3);
        x[3] = new Byte((byte)23);
        x[4] = new Short((short)455);

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
    }    
}
