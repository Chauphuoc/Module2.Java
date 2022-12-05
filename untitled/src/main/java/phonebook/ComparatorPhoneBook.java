package phonebook;

import java.util.Comparator;

public class ComparatorPhoneBook implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getName().compareTo(o2.getName())>1){
            return 1;
        }
        else if (o1.getName().compareTo(o2.getName())==0){
            return 0;
        }
        else return -1;
    }
}
