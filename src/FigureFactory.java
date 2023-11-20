import java.awt.Rectangle;

public class FigureFactory {

    public Figure create (double[] sides){
        if (sides.length == 1){
            return new Circle(sides[0]);
        } else if (sides.length == 2){
            Rectangle rectangle = new Rectangle(sides[0],
                    sides[1]);
            return rectangle;
        } else if (sides.length == 3) {
            return new Triangle(sides[0], sides[1], sides[2]);
        } else {
            throw new IllegalArgumentException("Can't create object with arguments " + sides);
        }
    }
}
