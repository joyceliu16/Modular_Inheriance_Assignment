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
public class Circle extends Shape{
    //declare instance variables
    private double radius;
    
    //constructor
    public Circle(double radius) {
      this.radius = radius;  
    }
    //method to calculate area
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    //method to calculate perimeter
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    //method to describe the instance
    @Override
    public String toString() {
        return super.toString()+"Circle[radius=" +radius+ "]";
        
    }
    
}


