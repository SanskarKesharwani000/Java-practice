// input: <No Input>, om, 2, 3, 0, 1

class P {
    static int i;
    public static void main(String[] args) {
        System.out.println("--------- start");

        try {
            int i = Integer.parseInt(args[0]);
            System.out.println("----- 1");
            
            pro();

            System.out.println("----- 2");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOBE");
        } catch(NumberFormatException e) {
            System.out.println("NFE");
        } finally {
            System.out.println("Essential Code...");
        }

        System.out.println("--------- end");
    }

    static void pro() {
        System.out.println("----- " + i++);
        pro();
    }
}