package ReadFileWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GTLN {
    public static List<Integer> ReadFileText (String filePath){
        List<Integer> listNumbers = new ArrayList<>();
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line ="";
            while ((line = br.readLine())!=null){
                listNumbers.add(Integer.parseInt(line));
            }
            br.close();
            return listNumbers;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static int findMax(List<Integer> list){
        int max = list.get(0);
        for (int i = 0; i< list.size();i++){
            if (max < list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }
    public static void writeFile (String filePath, int max){
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter br = new BufferedWriter(fileWriter);
            br.write("Giá trị lớn nhất là: " + max);
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\IdeaProjects\\Module2.Java\\ClassAndObject\\data\\product.txt";
        List<Integer> newList = ReadFileText(path);
        int maxValue = findMax(newList);
        writeFile("C:\\Users\\Admin\\IdeaProjects\\Module2.Java\\ClassAndObject\\data\\write.txt",maxValue);
    }
}
