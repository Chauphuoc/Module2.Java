package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
@Test
    public void testTriangle (){
    TriangleClassifier triangle1 = new TriangleClassifier();
    assertEquals("Tam giac deu",triangle1.testTriangle(3,3,3));
}
    @Test
    public void testTriangle1 (){
        TriangleClassifier triangle1 = new TriangleClassifier();
        assertEquals("Tam giac can",triangle1.testTriangle(3,2,3));
    }
    @Test
    public void testTriangle2 (){
        TriangleClassifier triangle1 = new TriangleClassifier();
        assertEquals("Tam giac thuong",triangle1.testTriangle(3,4,5));
    }
    @Test
    public void testTriangle3 (){
        TriangleClassifier triangle1 = new TriangleClassifier();
        assertEquals("Khong phai tam giac",triangle1.testTriangle(8,2,3));
    }
}