
/**
 *
 * @author Welcome Joyce!!!
 */

package pkg2d_shapes;

public class Main {

       public static void main(String[] args) {
        
        //construct instances   
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
