package Comparable;

public class Student implements Comparable<Student> {
    private int idStudent;
    private String name;
    private String nameClass;
    private double diemTrungBinh;

    public Student(int maSinhVien, String name, String nameClass, double diemTrungBinh) {
        this.idStudent = maSinhVien;
        this.name = name;
        this.nameClass = nameClass;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return idStudent;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.idStudent = maSinhVien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTen() {

        String s = this.getName().trim();
        if (s.indexOf(" ")>=0){
            int index = s.lastIndexOf(" ");
            return s.substring(index+1);
        }
        else return s;
    }

    @Override
    public int compareTo(Student o) {
        // <0
        // =0
        // >0
        // Dua tren so sanh ten
        // Ten: Adam, Barack Obama,     Nguyen Van A     , Tran Thi Thanh Yen
        String tenThis = this.getTen();
        String tenO=o.getTen();

        return tenThis.compareTo(tenO);
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                ", nameClass='" + nameClass + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                '}'+"\n";
    }
}
