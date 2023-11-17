public class Rectangle extends Figure{

    public Rectangle(double a, double b){
        super(new double[]{a,b});
    }

    public double getPerimeter(){
        return 2 * super.getPerimeter();
    }

    public double getArea(){
        return sides[0] * sides[1];
    }
}
