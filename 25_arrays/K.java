class K {
    public static void main(String[] args) {
        String[][] y = new String[3][2];

        System.out.println(y[0][0]);
        System.out.println(y[0][1]);
        System.out.println("~~~~~~~~~");
        System.out.println(y[1][0]);
        System.out.println(y[1][1]);
        System.out.println("~~~~~~~~~");
        System.out.println(y[2][0]);
        System.out.println(y[2][1]);
        System.out.println("###########################");

        y[0][0] = "om";
        y[0][1] = "ram";

        y[1][0] = "monu";
        y[1][1] = "raju";

        y[2][0] = "raja";
        y[2][1] = "golu";

        System.out.println("###########################");
        System.out.println(y[0][0]);
        System.out.println(y[0][1]);
        System.out.println("~~~~~~~~~");
        System.out.println(y[1][0]);
        System.out.println(y[1][1]);
        System.out.println("~~~~~~~~~");
        System.out.println(y[2][0]);
        System.out.println(y[2][1]);


    }    
}
