
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Shape circle= new Circle(5);
        Shape rectangle=new Rectangle(4,6);
        System.out.println("Area of Circle:"+ circle.area());
        System.out.println("Area of Rectangle:" + rectangle.area());
    }
}
