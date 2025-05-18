
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Circle extends Shape
{
    private double radius;
    public  Circle(double radius){
        this.radius= radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
