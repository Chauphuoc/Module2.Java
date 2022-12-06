package ReadFileWriteFile;

import java.io.*;

public class ReadFileExample {
    public static void readFileText(String filePath){
        File file = new File(filePath);
        try {
            if (!file.exists()){
                throw new RuntimeException();
            }
            String line ="";
            int sum = 0;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Tong: "+sum);
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Admin\\IdeaProjects\\Module2.Java\\ClassAndObject\\data\\product.txt");
        String path = "C:\\Users\\Admin\\IdeaProjects\\Module2.Java\\ClassAndObject\\data\\product.txt";
        readFileText(path);
    }
}
