import java.io.*;

public class FileIO {
    public static void main (String[] args) {

       // Writing data to a text file, using constructor method
       String[] names = {"John", "Carl", "Jerry"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Ebooks\\output.txt"));
            writer.write("Writing to a file.");
            writer.write("\nanother line");

            for (String name: names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) !=null)
           System.out.println(line);
           reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}