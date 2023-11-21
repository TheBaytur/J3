public class Circle extends Figure{

    public Circle(int radius){
        super(new int[]{radius});
    }

    public int getPerimeter(){
        return (int) (2 * 3.14 * sides[0]);
    }

    public int getArea(){
        return (int) (3.14 * sides[0] * sides[0]);
    }
}
