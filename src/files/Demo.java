/*
package files;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {

        FileWriter writer = new FileWriter("file.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter("file.txt");

        bufferedWriter.write("Hello World");
        writer.write("Hello World");

        bufferedWriter.close();
        writer.close();

        FileReader reader = new FileReader("file.txt");
        int c;
        while ((c = reader.read()) != -1) {
            System.out.println((char) c);
            Thread.sleep(500);
        }
        reader.close();

        BufferedReader br = new BufferedReader(reader, 5);
        String c;
        while ((c = br.readLine()) != null) {
            System.out.println(c);
            Thread.sleep(500);
        }
        reader.close();
    }
}
*/
