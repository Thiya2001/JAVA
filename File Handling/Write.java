import java.io.*;

public class Write {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\Qspiders Java\\File Handling\\Student.txt");

        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write("I am a student");
            fw.close();
            System.out.println("Demo");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
