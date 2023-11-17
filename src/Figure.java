public abstract class Figure {

    final String type;
    protected final double[] sides;
    protected Figure(double[] sides){
        this.type = getClass().getSimpleName();
        this.sides = sides;

    }
    public double getPerimeter(){
        double perimeter = 0;
        for (double side: sides){
            perimeter += side;
        }
        return perimeter;
    }
    public abstract double getArea();
}

// added type