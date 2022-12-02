package ArrayListandGeneric;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentClass dssv = new StudentClass();
        int yourChoice;
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
            yourChoice = scanner.nextInt();
            scanner.nextLine();
           switch (yourChoice){
               case 1:
                   System.out.println("Enter Name of Student:"); String nameStudent = scanner.nextLine();
                   System.out.println("Enter ID of Student:"); String idStudent = scanner.nextLine();
                   System.out.println("Enter Birthday of Student:"); int yearStudent = Integer.parseInt(scanner.nextLine());
                   System.out.println("Enter avarage score of Student:"); double averageStudent = Double.parseDouble(scanner.nextLine());
                   Student student = new Student(nameStudent,idStudent,yearStudent,averageStudent);
                   dssv.addStudent(student);

                   break;
               case 2:
                   dssv.printStudentList();
                   break;
               case 3:
                   System.out.println("Kiểm tra danh sách có rỗng hay không."+dssv.checkArrayList());
                   break;
               case 4:
                   System.out.println("So luong danh sach sinh vien:"+dssv.quantity());
                   break;
               case 5:
                   dssv.makeEmpty();
                   break;
               case 6:
                   System.out.println("Enter ID of Student:"); String idSv = scanner.nextLine();
                   Student sv1 = new Student(idSv);
                   System.out.println("Check Student in arraylist"+dssv.checkStudent(sv1));
                   break;
               case 7:
                   System.out.println("Enter ID of Student:"); String idSv2 = scanner.nextLine();
                   Student sv2 = new Student(idSv2);
                   System.out.println("Remove Student in arraylist"+dssv.removeStudent(sv2));
                   break;
               case 8:
                   System.out.println("Enter Name of Student:"); String nameStudent1 = scanner.nextLine();
                   System.out.println("Result");
                   dssv.searchStudent(nameStudent1);
                   break;
               case 9:
                   dssv.arrangeStudent();
                   dssv.printStudentList();
                   break;
               case 0:
           }
        }
        while (yourChoice!=0);
    }
}
