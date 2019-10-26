/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d_shapes;

import java.util.Scanner;

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
    public Circle() {
        this.userInput();
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
     @Override
    public void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle.");
        this.radius = getValue();    
      }   
}


