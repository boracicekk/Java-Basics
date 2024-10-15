import java.io.*;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            createFile();
            writeFile();
            readFile();
        }
        public static void createFile(){
            File file = new File("D:\\JavaProjects\\workingWithFiles\\src\\students.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getFileInfo(){
            File file = new File("D:\\JavaProjects\\workingWithFiles\\students.txt");

            //Reading file's name, path, learning write and read permission also learning file size:
            if(file.exists()){
                System.out.println("File Name: " + file.getName());
                System.out.println("File Path: " + file.getAbsolutePath());
                System.out.println("Is there write permission for the file?: " + file.canWrite());
                System.out.println("Is there read permission for the file?: " + file.canRead());
                System.out.println("File Size(byte): " + file.length());
            }
    }
    public static void readFile(){
            File file = new File("D:\\JavaProjects\\workingWithFiles\\students.txt");
        try {
            Scanner reader= new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFile(){
        try {
           BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\JavaProjects\\workingWithFiles\\students.txt",true));
           writer.newLine();
           writer.write("Bora");
           System.out.println("Written to the file");
           writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}