import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianglesTest {

    //Boundary value analysis to check, if the triangle is isosceles, equilateral, scalene or not a triangle
    @Test
    @DisplayName("Isosceles Triangle")
    public void test1() {
        Triangles myTriangle = new Triangles();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(1, 100, 100));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test2() {
        Triangles myTriangle = new Triangles();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(2, 100, 100));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test3() {
        Triangles myTriangle = new Triangles();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(199, 100, 100));
    }


    @Test
    @DisplayName("Not A Triangle")
    public void test4() {
        Triangles myTriangle = new Triangles();
        assertEquals("Not A Triangle", myTriangle.checkTriangle(200, 100, 100));
    }


    @Test
    @DisplayName("Isosceles Triangle")
    public void test5() {
        Triangles myTriangle = new Triangles();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 1, 100));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test6() {
        Triangles myTriangle = new Triangles();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 2, 100));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test7() {
        Triangles myTriangle = new Triangles();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 199, 100));
    }

    @Test
    @DisplayName("Not A Triangle")
    public void test8() {
        Triangles myTriangle = new Triangles();
        assertEquals("Not A Triangle", myTriangle.checkTriangle(100, 200, 100));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test9() {
        Triangles myTriangle = new Triangles();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 100, 1));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test10() {
        Triangles myTriangle = new Triangles();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 100, 2));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test11() {
        Triangles myTriangle = new Triangles();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 100, 199));
    }

    @Test
    @DisplayName("Not A Triangle")
    public void test12() {
        Triangles myTriangle = new Triangles();
        assertEquals("Not A Triangle", myTriangle.checkTriangle(100, 100, 200));
    }

    @Test
    @DisplayName("Equilateral Triangle")
    public void test13() {
        Triangles myTriangle = new Triangles();
        assertEquals("Equilateral Triangle", myTriangle.checkTriangle(100, 100, 100));
    }

    @Test
    @DisplayName("Scalene Triangle")
    public void test14() {
        Triangles myTriangle = new Triangles();
        assertEquals("Scalene Triangle", myTriangle.checkTriangle(100, 101, 102));
    }

    @Test
    @DisplayName("Not A Triangle")
    public void test15() {
        Triangles myTriangle = new Triangles();
        assertEquals("Not A Triangle", myTriangle.checkTriangle(-1, 1, 2));
    }


    // checking if values x, y and z are in allowed equivalence partition
    @Test
    @DisplayName("Value of x is not in the range of permitted values.")
    public void test16() {
        Triangles myTriangle = new Triangles();
        assertEquals("Value of x is not in the range of permitted values.", myTriangle.checkValue(-1, 1, 2));
    }

    @Test
    @DisplayName("Value of y is not in the range of permitted values.")
    public void test17() {
        Triangles myTriangle = new Triangles();
        assertEquals("Value of y is not in the range of permitted values.", myTriangle.checkValue(100, 0, 100));
    }

    @Test
    @DisplayName("Value of z is not in the range of permitted values.")
    public void test18() {
        Triangles myTriangle = new Triangles();
        assertEquals("Value of z is not in the range of permitted values.", myTriangle.checkValue(100, 100, 0));
    }

    @Test
    @DisplayName("Value of x is not in the range of permitted values.")
    public void test19() {
        Triangles myTriangle = new Triangles();
        assertEquals("Value of x is not in the range of permitted values.", myTriangle.checkValue(201, 100, 100));
    }

    @Test
    @DisplayName("Value of y is not in the range of permitted values.")
    public void test20() {
        Triangles myTriangle = new Triangles();
        assertEquals("Value of y is not in the range of permitted values.", myTriangle.checkValue(100, 201, 100));
    }

    @Test
    @DisplayName("Value of z is not in the range of permitted values.")
    public void test21() {
        Triangles myTriangle = new Triangles();
        assertEquals("Value of z is not in the range of permitted values.", myTriangle.checkValue(100, 100, 201));
    }



    }











