import java.io.*;

public class Read {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Java\\Qspiders Java\\File Handling\\Personal.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
