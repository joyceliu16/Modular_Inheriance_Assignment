
/**
 * @author Joyce
 */


package pkg2d_shapes;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Shape {
    
    /* all subclasses have the following methods:
    *   getArea(), getPerimeter(), toString(), getValue(), userInput(),
    *   and displayResult()
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
    
    // method to describe the instance
    @Override
    public String toString() {
        return "Shape of ";
    }
    
    // user input method, will be overriden in subclasses
    public void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input shape parameters.");
     }
    
    // method to handle input mismatch exception
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
      
    // method to display results
    public void displayResult() {
        System.out.println(this.toString());
        System.out.println("The area is " + this.getArea());
        System.out.println("The perimeter is " + this.getPerimeter());
        System.out.println();
    }


    
   }
        

