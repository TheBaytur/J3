public class Circle extends Figure{

    public Circle(double radius){
        super(new double[]{radius});
    }

    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }
}
