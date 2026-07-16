import java.io.Console;

class X {
    public static void main(String[] args) {
        Console c = System.console(); 

        String[][][] x = new String[][][] {
                                            {
                                                {"a","b","c"},
                                                {"x","y"},
                                                {"m","n","o","p"},
                                                {"i","j","k"}
                                            },
                                            {
                                                {"p","q","r"}
                                            },
                                            {
                                                {"c","d"},
                                                {"e","f","g","h","i","j","k"}
                                            }
                                        };

        for(String[][] next : x) {
            for(String[] nx : next) {
                for(String n : nx) {
                    System.out.print(n + " ");
                }
                System.out.println();
            }
            System.out.println("++++++++++++++++++++++++++++");
        }
    }    
}
