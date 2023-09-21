/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unilecturesoop;

/**
 *
 * @author Benjamin Høj
 */

/*
Create a class named Point2D with two int
instance variables named x and y.
Both instance variables should be declared private. Do not ini�alize the two instance
variables. Add seters and geters for the two instance variables that will allow the users of
the Point2D class to change and access their values
*/
public class Point2D {
    private int x;
    private int y;
    
    /*
    Implement a method named distance in the
    Point2D class that you created in the previous exercise. The method accepts an instance
    of the Point2D class and returns the distance between the current point and the point
    represented by the parameter
    */
    public double distance(Point2D p) {
        double calc = (p.x - x)^2 + (p.y - y)^2;
        double dist = Math.sqrt(calc);
        System.out.println(dist);
        return dist;
    }
    
    /*
    Enhance the Point2D class by adding a static
    factory method named create(). A factory method in a class is used to create objects of
    the class.
    */
    public static Point2D create(int x, int y) {
        Point2D newPoint = new Point2D();
        newPoint.setX(x);
        newPoint.setY(y);
        return newPoint;
    }
    
    void setX(int i){
        int x = i;
    }
    void setY(int i){
        int x = i;
    }
    
    int getX(){
        return x;
    }
    
    int getY(){
        return y;
    }

}
