import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("D:\\JavaProjects\\readingFileDemo\\src\\numbers.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            reader.close();
        }
    }
}