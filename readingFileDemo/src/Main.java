import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        int total =0;
        try {
            reader = new BufferedReader(new FileReader("D:\\JavaProjects\\githubrepo\\readingFileDemo\\src\\numbers.txt"));
            String line = null;
            while ((line = reader.readLine() ) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("Total: " + total);
        } catch (Exception e) {
            e.printStackTrace();
            }finally {
        try{
            reader.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        }
    }
}
