public class Rectangle extends Figure{

    public Rectangle(int a, int b){
        super(new int[]{a,b});
    }

    @Override
    protected String getType() {
        return "Rectangle";
    }

    public int getPerimeter(){return 2 * super.getPerimeter();
    }

    public int getArea(){return sides[0] * sides[1];
    }

    @Override
    public String toString() {
        return getType() + " " + "area is: " + getArea();
    }
}
