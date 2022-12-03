package AbstractAndInterface;

public class ComparatorByPerimeter implements Comparator {
    @Override
    public int toCompareRectangle(Object obj1, Object obj2) {
        Circle r1 = (Circle) obj1;
        Circle r2 = (Circle) obj2;
        if (r1.getPerimeter()>r2.getPerimeter()){
            return 1;
        }
        else if (r1.getPerimeter()==r2.getPerimeter()){
            return 0;
        }
        else {return -1;}
    }
    public int toCompareCircle(Object obj1, Object obj2) {
        Rectangle r1 = (Rectangle) obj1;
        Rectangle r2 = (Rectangle) obj2;

        if (r1.getArea()>r2.getArea()){
            return 1;
        }
        else if (r1.getArea()==r2.getArea()){
            return 0;
        }
        else {return -1;}
    }
}
