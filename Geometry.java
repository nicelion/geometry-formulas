
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
    * @param base The base of your triangle
    * @param height Height of your triangle
    */
    
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static double parallelogramArea(double base, double height)
    {
        double area = base * height;
        return area;
    }
    
    public static double trapezoidArea(double a, double b, double height)
    {
        double area = ((a + b) / 2.0) * height;
        return area;
    }
    
    public static double rectangularPrismVolume(double w, double h, double length)
    {
        double volume = w * h * length;
        return volume;
    }
    
    public static double coneVolume(double r, double h)
    {
        double volume = (Math.PI * Math.pow(r, 2)) * (h / 3.0);
        return volume;
    }
    public static double rectPrismSurfaceArea(double length, double w, double h)
    {
        double area = 2.0 * (w * length) + (h * length) + (h * w);
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
    }
}
