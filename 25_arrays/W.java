import java.io.Console;

class W {
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
