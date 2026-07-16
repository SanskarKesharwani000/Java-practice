import java.io.File;

class T {
    public static void main(String[] args) {
        File file = new File("D:/STS/backup/p1");

        File[] arr = file.listFiles();

        for(File next : arr)
            System.out.println(next + " (" + (next.isFile()?"File":"Folder") + ")");            
    }    
}
