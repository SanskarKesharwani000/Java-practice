import java.io.File;

class K {
    public static void main(String[] args) {
        File file = new File("movies/tollywood/action");

        // boolean flag = file.mkdir();
        boolean flag = file.mkdirs();

        System.out.println("Folder Created: " + flag);
    }    
}
