import java.io.File;
import java.io.IOException;

class L {
    public static void main(String[] args) throws IOException {
        File file = new File("movies/kollywood");
        boolean flag1 = file.mkdirs();

        File file2 = new File("movies/kollywood/bahubali.mp4");
        boolean flag2 = file2.createNewFile();

        System.out.println("Folder Created: " + flag1);
        System.out.println("File Created: " + flag2);
    }    
}
