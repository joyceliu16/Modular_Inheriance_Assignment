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
public class Rectangle extends Shape {
    //declare instance variables
    private double length; 
    private double width;
    
    //constructor 
    public Rectangle() {
        length = 1;
        width = 1;
    }
    //overloaded constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //method to calculate area of rectangle
    @Override
    public double getArea() {
        return length*width;
    }
    //method to calculate perimeter of rectangle
    @Override
    public double getPerimeter() {
        return (2*length)+(2*width);
    }
    @Override
    public String toString() {
        return super.toString()+"Rectangle[length="+length +", width="+ width + "]";
    }
}
