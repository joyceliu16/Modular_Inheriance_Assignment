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

import java.util.Scanner;

public class Rectangle extends Shape {
    //declare instance variables
    private double length; 
    private double width;
    
    //constructor 
   /* public Rectangle() {
        length = 1;
        width = 1;
    }*/
    
    public Rectangle() {
        this.userInput();
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
    
    //method to describe the instance
    @Override
    public String toString() {
        return super.toString()+"Rectangle[length="+length +", width="+ width + "]";
    }
    
    //user input method
    @Override
    public void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle:");
        this.length = getValue();
        System.out.println("Please enter the width of the rectangle:");
        this.width = getValue();
      }
}
