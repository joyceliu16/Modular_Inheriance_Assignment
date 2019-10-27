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
import java.util.InputMismatchException;


public class Shape {
    
    /* all subclasses have the following methods:
    *   getArea(), getPerimeter(), toString(), getValue(), userInput()
    */
    
    public double getArea() {
        //shape unknown, cannot compute area, will be overriden in subclasses
        System.out.println("Shape unknown. Cannot calculate the area.");
        return 0;  
    }
    
    public double getPerimeter() {
         //shape unknown, cannot compute perimeter, will be overriden in subclasses
        System.out.println("Shape unknown. Cannot calculate the perimeter.");
        return 0;
    }
    
    @Override
    public String toString() {
        return "Shape of ";
    }
    
    public void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input shape parameters.");
     }
    
    public double getValue() {
        double val;
        Scanner input = new Scanner(System.in);
     
        while(true) {
            try {
            val = input.nextDouble();
            break;
            }
        catch (InputMismatchException err) {
            System.out.println("Please enter a positive number.");
            input.next();
            }
         }
        
        return val;
    }
            
        }
        

