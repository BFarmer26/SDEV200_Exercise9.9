                    // UML diagram
/**************************************************************
*                     RegularPolygon                          *
***************************************************************
* -n: int                                                     *
* -side: double                                               *
* -x: double                                                  *
* -y: double                                                  *
* +RegularPolygon()                                           *
* +RegularPolygon(n: int, side: double)                       *
* +RegularPolygon(n: int, side: double, x: double, y: double) *
* +setN(newN: int)                                            *
* +setSide(newSide: double)                                   *
* +setX(newX: double)                                         *              
* +setY(newY: double)                                         * 
* +getN(): int                                                *
* +getSide(): double                                          *
* +getX(): double                                             *              
* +getY(): double                                             * 
* +getPerimeter(): double                                     *
* +getArea(): doulbe                                          *           
**************************************************************/

// Creates public class for RegularPolygon
public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

// Creates a regular polygon with default values
public RegularPolygon() {

    n = 3;
    side = 1;
    x = y = 0;
}

public RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
        x = y = 0;
    }

public RegularPolygon(int newN, double newSide, double newX, double newY) {
    n = newN;
    side = newSide;
    x = newX;
    y = newY;
}

// Sets new n value
public void setN(int newN) {
    n = newN;
}

// Sets new side length
public void setSide(double newSide) {
    side = newSide;
}

// Sets new x-coordinate
public void setX(double newX) {
    x = newX;
}

// Sets new y-coordinate
public void setY(double newY) {
    y = newY;
}

// Returns n
public int getN() {
    return n;
}

// Returns the length
public double getSide() {
    return side;
}

// Returns x
public double getX() {
    return x;
}

// Returns y
public double getY() {
    return y;
}

// Returns the perimeter
public double getPerimeter() {
    return side * n;
}

// Returns the area
public double getArea() {
    return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
}

}
