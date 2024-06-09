// Creates class for a test of
// RegularPolygon class 
public class RegularPolygonTest {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1:");
        System.out.println("Perimeter: " + polygon1.getPerimeter());
        System.out.println("Area: " + polygon1.getArea());

        System.out.println("\nPolygon 2:");
        System.out.println("Perimeter: " + polygon1.getPerimeter());
        System.out.println("Area: " + polygon2.getArea());

        System.out.println("\nPolygon 3:");
        System.out.println("Perimeter: " + polygon3.getPerimeter());
        System.out.println("Area: " + polygon3.getArea());
    }

}
