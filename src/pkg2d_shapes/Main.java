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
public class Main {

   
    public static void main(String[] args) {
        /*Triangle shape1 = new Triangle(6, 8, 10);
        Rectangle shape2 = new Rectangle(3, 4);
        Circle shape3 = new Circle (3);*/
        
        Triangle shape1 = new Triangle(); 
        System.out.println(shape1.toString());
        System.out.println("The area is " + shape1.getArea());
        System.out.println("The perimeter is " + shape1.getPerimeter());
        System.out.println();
        
        Rectangle shape2 = new Rectangle();
        System.out.println(shape2.toString());
        System.out.println("The area is " + shape2.getArea());
        System.out.println("The perimeter is " + shape2.getPerimeter());
        System.out.println();
        
        Circle shape3 = new Circle();
        System.out.println(shape3.toString());
        System.out.println("The area is " + shape3.getArea());
        System.out.println("The perimeter is " + shape3.getPerimeter());
           
    }
 
}
