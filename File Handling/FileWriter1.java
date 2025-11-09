import java.io.*;

public class FileWriter1 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Java\\Qspiders Java\\File Handling\\Personal.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file, true);
        System.out.println("Done");
        // fw.write("\n My Name is Thiyagu");
        // fw.write("\n I am a student");
        // fw.write("\n My age is 24");
        fw.write("All Complete the Java");
        fw.close();
    }
}
