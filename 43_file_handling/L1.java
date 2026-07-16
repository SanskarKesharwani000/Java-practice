import java.io.File;
import java.io.IOException;

class L1 {
    public static void main(String[] args) throws IOException {
        File file = new File("movies/tollywood");
        boolean flag1 = file.mkdirs();

        File file2 = new File("movies/tollywood", "mahendra_bahubali.mp4");
        // File file2 = new File("C:/NEW/javaprac/43_file_handling", "movies/tollywood/amrendra_bahubali.mp4");
        boolean flag2 = file2.createNewFile();

        System.out.println("Folder Created: " + flag1);
        System.out.println("File Created: " + flag2);
    }    
}
