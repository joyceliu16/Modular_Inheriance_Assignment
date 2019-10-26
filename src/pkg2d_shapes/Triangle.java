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
public class Triangle extends Shape {
    //define instance variables
    private double side1;
    private double side2;
    private double side3;
    
    //constructor
   /* public Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }*/
    public Triangle() {
        this.userInput();
    }
    //overloading constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //method to calculate perimeter
    @Override
    public double getPerimeter(){
        return side1 + side2 +side3; 
    }
    //method to calculate area
    @Override
    public double getArea() {
        double p = this.getPerimeter()/2;
        //Double p equals (side1 + side2 + side3)/2.
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));    
    }
    @Override
    public String toString() {
        return super.toString()+"Triangle[side1=" + side1 +", side2=" + side2 +", side3=" + side3 + "]";
    }
     @Override
    public void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first side length of the triangle.");
        side1 = input.nextDouble();
        System.out.println("Please enter the second side length of the triangle.");
        side2 = input.nextDouble();
        System.out.println("Please enter the third side length of the triangle.");
        side3 = input.nextDouble();
      }
    
}
