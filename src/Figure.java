public abstract class Figure {

    final String type;
    protected final int[] sides;
    protected Figure(int[] sides){
        this.type = getType();
        this.sides = sides;
    }

    protected String getType() {
        return getClass().getSimpleName();
    }
       protected abstract int getArea();


    protected int getPerimeter(){
        int perimeter = 0;
        for (int side: sides){
            perimeter += side;
        }
        return perimeter;
    }

    public String toString() {
        return getType() + " area is: " + getArea() + ", perimeter: " + getPerimeter();
    }
}



// added type