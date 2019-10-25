/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d_shapes;

/**
 *
 * @author Welcome Joyce!!!
 */
public class Triangle {
    //define instance variables
    private double side1;
    private double side2;
    private double side3;
    
    //constructor
    public Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }
    //overloading constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //method to calculate perimeter
    public double getPerimeter(){
        return side1 + side2 +side3; 
    }
    //method to calculate area
    public double getArea() {
        double p = this.getPerimeter()/2;
        //Double p equals (side1 + side2 + side3)/2.
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));    
    }
    public String toString() {
        return "Triangle[side1=" + side1 +", side2=" + side2 +", side3=" + side3 + "]";
    }
    
}
