import java.io.File;
import java.io.IOException;

class L2 {
    public static void main(String[] args) throws IOException {
        File file = new File("books/programming");
        boolean flag1 = file.mkdirs();

        // File file2 = new File("movies/tollywood", "mahendra_bahubali.mp4");
        File file2 = new File(file, "HeadFirstJava.pdf");
        boolean flag2 = file2.createNewFile();

        System.out.println("Folder Created: " + flag1);
        System.out.println("File Created: " + flag2);
    }    
}
