import java.io.FileReader;

class G {
    public static void main(String[] args) {
        System.out.println("---- start");    
        FileReader x = new FileReader("mohan.txt"); 
        System.out.println("---- end");    
    }    
}



// G.java:6: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader x = new FileReader("mohan.txt");
//                        ^
// 1 error