package CollectionJames;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapAndHashSetStudent {
    private String name;
    private int age;
    private String address;

    public HashMapAndHashSetStudent(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        HashMapAndHashSetStudent student1 = new HashMapAndHashSetStudent("Nam", 18,"Tran Phu Street");
        HashMapAndHashSetStudent student2 = new HashMapAndHashSetStudent("Phu", 18,"Ha Noi Street");
        HashMapAndHashSetStudent student3 = new HashMapAndHashSetStudent("Lan", 18,"Nguyen Sinh cung Street");
        HashMapAndHashSetStudent student4 = new HashMapAndHashSetStudent("Cuong", 18,"Lam Hoang Street");
        Map<Integer, HashMapAndHashSetStudent> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student4);
        for(Map.Entry<Integer, HashMapAndHashSetStudent> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println("...........Set");
        Set<HashMapAndHashSetStudent> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(HashMapAndHashSetStudent student : students){
            System.out.println(student.toString());
        }
    }
}
