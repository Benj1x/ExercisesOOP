package unilecturesoop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benjamin Høj
 */
/*
    Create a Circle class that has three private
    final instance variables named x, y, and radius. The x and y instance variables represent
    the x and y coordinates of the center of the circle; they are of int data type. The radius
    instance variable represents the radius of the circle; it is of the double data type. Add a
    constructor to the Circle class that accepts the values for its instance variables x, y, and
    radius. Add geters for the three instance variables.
    */
public class Circle {
    public Circle(int x, int y, double radius){
        this.x = x;
        this.x = y;
        this.radius = radius;
    }
    private final int x = 0;
    private final int y = 0;
    private final double radius = 0;

    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    double getRadius(){
        return radius;
    }

    /*
    Enhance the Circle class by adding four
    instance methods named centerDistance, distance, overlaps, and touches. All
    these methods accept a Circle as a parameter. The centerDistance method returns
    the distance (as a double) between the centers of the circle and another circle passed in
    as the parameter. The distance method returns the minimum distance (as a double)
    between the two circles. If two circles overlap, the distance method returns a nega�ve
    number. The overlaps method returns true if two circles overlap and false otherwise.
    The touches method returns true if two circles touch each other and false otherwise.
    The distance method must use the centerDistance method. The body of the
    overlaps and touches methods must contain only one statement that uses the distance
    method.
     */
    public double centerDistance(Circle circle){

        double Centerdist = Math.sqrt(Math.pow((circle.x - x), 2) + Math.pow((circle.y - y), 2));

        return Centerdist;
    }
    public double distance(Circle circle){
        double Centerdist = centerDistance(circle);
        double Dist = Centerdist - (circle.radius + radius);

        return Dist;
    }
    public boolean overlap(Circle circle){

        return distance(circle) < 0;
    }

    public boolean touches(Circle circle){

        return distance(circle) == 0;
    }

    /*
    Enhance the Circle class by adding two
    methods named perimeter and area that compute and return the perimeter and area
    of the circle, respectively
     */

    public double perimeter(){
        double d = radius * 2;
        return d * Math.PI;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    /*
    Add a second constructor to the Circle
    class that takes a double parameter, which is the radius of the circle. This constructor
    should call another exisng constructor of the Circle class with three parameters passing
    zero as the values for x and y
     */
}
