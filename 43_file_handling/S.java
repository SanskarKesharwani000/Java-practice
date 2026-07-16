import java.io.File;

class S {
    public static void main(String[] args) {
        File file = new File("D:/STS/backup/p1");

        String[] arr = file.list();

        for(String next : arr)
            System.out.println(next);            
    }    
}
