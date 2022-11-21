package ArrayListandGenericExample;

import ArrayListandGeneric.StudentClass;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentClassExam listStudent = new StudentClassExam();
        int yourchoice;
        do {
            System.out.println("Menu-----------");
            System.out.println("1.Thêm sinh viên vào danh sách.");
            System.out.println("2.In danh sách sinh viên ra màn hình.");
            System.out.println("3.Kiểm tra danh sách có rỗng hay không.");
            System.out.println("4.Lấy ra số lượng sinh viên trong danh sách.");
            System.out.println("5.Làm rỗng danh sách sinh viên.");
            System.out.println("6.Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.");
            System.out.println("7.Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.");
            System.out.println("8.Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.");
            System.out.println("9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp.");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            yourchoice = Integer.parseInt(scanner.nextLine());
//            scanner.nextLine();
            switch (yourchoice){
                case 0:
                case 1:
                    System.out.println("Enter your name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter your ID:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter your birthday:");
                    String birthday = scanner.nextLine();
                    System.out.println("Enter your average score:");
                    float average = Float.parseFloat(scanner.nextLine());
                    Student student = new Student(name,id,birthday,average);
                    listStudent.addstudent(student);
                    break;
                case 2:
                    listStudent.printListStudent();
                    break;
                case 3:
                    System.out.println("Is there empty?"+listStudent.checkEmpty());
                    break;
                case 4:
                    System.out.println("So luong sinh vien:"+listStudent.getSize());
                    break;
                case 5:
                    listStudent.makeEmpty();
                    break;
                case 6:
                    System.out.println("Enter your ID:");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    Student std = new Student(id1);
                    System.out.println("Check student in list:"+listStudent.checkStudent(std));
                    break;
                case 7:
                    System.out.println("Enter your ID:");
                    int id2 = Integer.parseInt(scanner.nextLine());
                    Student std2 = new Student(id2);
                    System.out.println("Check remove student in list:"+listStudent.removeStudent(std2));
                    break;
                case 8:
                    System.out.println("Enter your name:");
                    String name1 = scanner.nextLine();
                    Student std3 = new Student(name1);
                    listStudent.searchStudent(std3);
                    break;
                case 9:
                    listStudent.arrangeList();
                    listStudent.printListStudent();
                    break;
            }
        }
        while (yourchoice!=0);

    }
}
