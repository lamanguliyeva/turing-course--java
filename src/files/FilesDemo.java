package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) {
        String fileName = "config.txt";
        checkingFileProperties(fileName);
        writeToFile(fileName, "Hello, this is a test message!");
        deleteFile(fileName);
        readingFromFile(fileName);
    }

    public static void checkingFileProperties(String fileName) {
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("File Name: " + file.getName());
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File " + fileName + " successfully deleted.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

    public static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            } catch (IOException e) {

        }
    }

    public static void readingFromFile(String fileName) {
        File file = new File(fileName);

        if (file.exists()) {
            try (FileReader reader = new FileReader(file)) {
                int character;
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }
                System.out.println();
            } catch (IOException e) {
                System.out.println("An error occurred while reading from the file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File does not exist.");
        }
    }


}
