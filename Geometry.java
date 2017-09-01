
/**
 * Write a description of class Geometry here.
 * 
 * @author Ian Thompson
 * @version 0.0.1
 */
public class Geometry 
{
    
    /**
    * Returns the area for a triangle
    * @param base the base of your triangle
    * @param height height of your triangle
    * @return area for a triangle
    */
    
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    /**
     * Returns the area for a rectangle
     * @param length length of rectangle
     * @param width width of rectangle
     * @return area of a rectangle
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
   /**
     * Returns the volume for a sphere
     * @param radius radius of sphere
     * @return volume of a sphere
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    /**
     * Returns the area for a parallelogram
     * @param base base of parallelogram
     * @param height height of parallelogram
     * @return area of a parallelogram
     */    
    public static double parallelogramArea(double base, double height)
    {
        double area = base * height;
        return area;
    }
    /**
     * Returns the area for a trapezoid
     * @param a length side A of trapezoid
     * @param b length side B of zrapezoid
     * @param height height of trapezoid
     * @return area of a trapezoid
     */    
    public static double trapezoidArea(double a, double b, double height)
    {
        double area = ((a + b) / 2.0) * height;
        return area;
    }
    /**
     * Returns the bolume for a rectangular prism
     * @param w length of rectangle
     * @param h width of rectangle
     * @return volume of a rectangular prisim
     */    
    public static double rectangularPrismVolume(double w, double h, double length)
    {
        double volume = w * h * length;
        return volume;
    }
     /**
     * Returns the area for a rectangle
     * @param length length of rectangle
     * @param width width of rectangle
     * @return volume of a cone
     */   
    public static double coneVolume(double r, double h)
    {
        double volume = (Math.PI * Math.pow(r, 2)) * (h / 3.0);
        return volume;

    }
   /**
     * Returns the area for a rectangle
     * @param length length of rectangle
     * @param width width of rectangle
     * @return surface area for a rectangular prisim
     */
    public static double rectPrismSurfaceArea(double length, double w, double h)
    {
        double area = 2.0 *((w * length) + (h * length) + (h * w));
        return area;
    }
    /***
     * Returns the surface area of a sphere
     * @param r radius of sphere
     * @return sphere surface area
     */
    public static double sphereSurfaceArea(double r)
    {
        double area = 4 * Math.PI * (Math.pow(r, 2));
        return area;
    }
    /**
     * Returns the hypotenuse of a right triangle 
     * @param a side a of triangle
     * @param b side b of triangle
     * @return right triangle hypotenuse
     */
    public static double hypotenuseOfRightTriangle(double a, double b)
    {
        double c =  Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2))));
        return c;
    }
    /**
     * Returns the distance between two points
     * @param x1 X1
     * @param x2 X2
     * @param y1 Y1
     * @param y2 Y2
     * @return distance between points
     */
    public static double distancePoints(double x1, double x2, double y1, double y2)
    {
        double d = Math.sqrt((Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0)));
        return d;
    }
    /**
     * Returns the slope of a line
     * @param x1 X1 of line
     * @param y1 Y1 of line
     * @param x2 X2 of line
     * @param y2 Y2 of line
     * @return slope of a line
     */
    public static double slope(double x1, double y1, double x2, double y2) 
    {
        double slope = (y2 - y1) / (x2 - x1);
        return slope;
    }
    /**
     * Returns area for a triangle, given a, b, c
     * @param a side a
     * @param b side b
     * @param c side c
     * @return triangle area, given a, b, c
     */
    public static double triangleArea(double a, double b, double c)
    {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
    public static void main(String[] args) 
    {
        /*double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);*/
        
        double parArea = parallelogramArea(5, 10);
        System.out.println("Parallelogram Area: " + parArea);
        
        System.out.println("Trap. Area: " + trapezoidArea(5, 20, 31));
        System.out.println("Rect. Prism Volume: " + rectangularPrismVolume(3, 4, 8));
        System.out.println("Cone Volume: " + coneVolume(5, 20));
        System.out.println("Rect. Prism SA: " + rectPrismSurfaceArea(5, 20, 4));
        System.out.println("Sphere SA: " + sphereSurfaceArea(10));
        System.out.println("Hypotenuse: " + hypotenuseOfRightTriangle(4, 9));
        System.out.println("Distance: " + distancePoints(-3, 0, 2, -3));
        System.out.println("Slope: " + slope(.5, .3, 5, 0)); 
        System.out.println("Area of Triangle: " + triangleArea(25, 21, 12));
        
    }
}
