package ArrayListandGenericExample;

import java.util.*;

public class HashSetExample<S> {
    Set <String> thungPhieuDuThuong = new HashSet<>();

    public boolean themphieuduthuong (String a){
        return this.thungPhieuDuThuong.add(a);
    }

    public boolean xoaPhieuduthuong (String a){
        return this.thungPhieuDuThuong.remove(a);
    }

    public boolean kiemtraPhieu (String a){
        return this.thungPhieuDuThuong.contains(a);
    }

    public boolean xoaAll (){
        return this.thungPhieuDuThuong.removeAll(this.thungPhieuDuThuong);
    }
    public int laySoluong (){
        return this.thungPhieuDuThuong.size();
    }
    public String rutPhieu (){
        String result = "";
        Random rd = new Random();
        int vitri =rd.nextInt(this.thungPhieuDuThuong.size());
        result = (String) this.thungPhieuDuThuong.toArray()[vitri];
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.thungPhieuDuThuong.toArray());
    }

    public static void main(String[] args) {
        HashSetExample rt = new HashSetExample();
        Scanner scanner = new Scanner(System.in);
        int choice =0;
        do {
            System.out.println("-------------------------");
            System.out.println("Menu");
            System.out.println("1.Them ma so du thuong");
            System.out.println("2.Xoa ma so du thuong");
            System.out.println("3.Kiem tra phieu du thuong co ton tai khong");
            System.out.println("4.Xoa tat ca cac phieu du thuong");
            System.out.println("5.So luong phieu du thuong");
            System.out.println("6.Rut tham trung thuong");
            System.out.println("7.Printing");
            System.out.println("0.Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 0:
                case 1:
                    System.out.println("Nhap ma so du thuong:");
                    String a =scanner.nextLine();
                    rt.themphieuduthuong(a);
                    break;
                case 2:
                    System.out.println("Xoa ma so du thuong:");
                    String b =scanner.nextLine();
                    rt.xoaPhieuduthuong(b);
                    break;
                case 3:
                    System.out.println("Kiem tra ma so du thuong:");
                    String c =scanner.nextLine();
                    System.out.println(rt.kiemtraPhieu(c));;
                    break;
                case 4:
                    rt.xoaAll();
                case 5:
                    System.out.println("Quantity:"+rt.laySoluong());
                case 6:
                    System.out.println(rt.rutPhieu());;
                case 7:
                    System.out.println(rt.toString());
            }
        }
        while (choice!=0);
    }
}
