import java.io.*;
public class CreateFile {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\Qspiders Java\\File Handling\\File.txt");

        try {
            if(file.createNewFile()) {
                System.out.println("File is Created");
            }
            else
            System.out.println("File Already Exists");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}