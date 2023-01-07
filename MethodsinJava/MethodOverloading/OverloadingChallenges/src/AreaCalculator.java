public class AreaCalculator {
    // First version of area method with single parameter
    public static double area(double radius) {

        // Validate the radius is greater than zero
        if (radius < 0) {
            return -1;
        }

        // Calculate the area
        double area = Math.PI * radius * radius;

        // Return the area
        return area;
    }

    // Second version of area method with two parameters
    public static double area(double x, double y) {

        // Validate the side lengths are greater than zero
        if (x < 0 || y < 0) {
            return -1;
        }

        // Calculate the area
        double area = x * y;

        // Return the area
        return area;
    }
}
