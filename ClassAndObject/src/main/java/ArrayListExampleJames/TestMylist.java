package ArrayListExampleJames;


import java.util.Arrays;

public class TestMylist {
    public static void main(String[] args) {
        Mylist<Integer> test2 = new Mylist<Integer>();
        test2.add(4);
        test2.add(9);
        test2.add(10);
        test2.add(1,91);
        test2.remove(2);

        test2.printing();

        test2.clone().printing();
        System.out.println(test2.contains(91));

        System.out.println(test2.get(1));
        System.out.println(test2.indexOf(4));
        test2.printing();
    }
}
