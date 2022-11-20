package refactoring;

public class TriangleClassifier {
    public String testTriangle (int sideA, int sideB, int sideC) {
        if (sideA+sideB>sideC&&sideB+sideC>sideA&&sideA+sideC>sideB){
            if (sideA==sideB&&sideB==sideC){
                return "Tam giac deu";
            }
            else if (sideA==sideB||sideA==sideC||sideB==sideC){
                return "Tam giac can";
            }
            else return "Tam giac thuong";
        }
        else return "Khong phai tam giac";
    }
}
