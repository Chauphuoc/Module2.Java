package dictionaryExample;

import javax.xml.crypto.Data;
import java.util.*;

public class Dictionary {

    private static Map<String, String> myDatabase = new TreeMap<String,String>() ;
    public String addWord (String word, String mean ){
        return this.myDatabase.put(word,mean);
    }
    public String clearWord (String word){
        return this.myDatabase.remove(word);
    }
    public void searchWord(String word){
        String result = this.myDatabase.get(word);
        System.out.println(result);

    }
    public void printing (){
        Set <String> collectionData = this.myDatabase.keySet();
        System.out.println(Arrays.toString(collectionData.toArray()));
//        this.Data.keySet()
    }
    public int quantity(){
        return this.myDatabase.size();
    }
    public void clearAll (){
        this.myDatabase.clear();
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary ();
        int choice=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------------");
            System.out.println("DICTIONARY ENGLISH-VIETNAMESE");
            System.out.println("1.Add Word");
            System.out.println("2. Clear word");
            System.out.println("3. Search word");
            System.out.println("4. Printing");
            System.out.println("5. Get size");
            System.out.println("6. Clear All");
            System.out.println("0. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 0:

                case 1:
                    System.out.println("Enter your word:");
                    String a = scanner.nextLine();
                    System.out.println("Mean:");
                    String b = scanner.nextLine();
                    dictionary.addWord(a,b);

                    break;
                case 2:
                    System.out.println("Enter your word:");
                    String c = scanner.nextLine();
                    dictionary.clearWord(c);
                    break;
                case 3:
                    System.out.println("Enter your word:");
                    String d = scanner.nextLine();
                    dictionary.searchWord(d);
                    break;
                case 4:
                    dictionary.printing();
                    break;
                case 5:
                    System.out.println(dictionary.quantity());
                    break;
                case 6:
                    dictionary.clearAll();
                    dictionary.printing();
                    break;
            }
        }
        while (choice!=0);
    }
}
