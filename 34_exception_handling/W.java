import java.io.FileReader;

class W {
    public static void main(String[] args) throws Exception {
        FileReader x = new FileReader("golu.txt");
    }    

    // OR

    // public static void main(String[] args) throws FileNotFoundException {
    //     FileReader x = new FileReader("golu.txt");
    // }    
}

// Exception w = new FileNotFoundException();  // ok
