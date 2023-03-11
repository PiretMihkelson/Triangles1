public class Triangles {
    public String checkTriangle(
            int x,
            int y,
            int z) {
// checking, if depending on the values entered, if its equilateral, isosceles or scalene triangle or not a triangle
        if (x >= y + z || y >= x + z || z >= x + y) {
            return "Not A Triangle";

        } else if (x == y && y == z) {
            return "Equilateral Triangle";

        } else if (x == y || y == z || z == x) {
            return "Isosceles Triangle";

        } else
            return "Scalene Triangle";

    }

    //checking, if the value entered, is in allowed equivalence partition
    public String checkValue(
            int x,
            int y,
            int z) {

        if (x < 1 || x > 200) {
            return "Value of x is not in the range of permitted values.";

        }
        if (y < 1 || y > 200) {
            return "Value of y is not in the range of permitted values.";

        }
        if (z < 1 || z > 200)
            return "Value of z is not in the range of permitted values.";
        return null;
    }

}