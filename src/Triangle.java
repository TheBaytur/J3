public class Triangle extends Figure{

   public Triangle(int a, int b, int c) {
       super(new int[]{a,b,c});
   }

   public int getArea(){
       int p = (sides[0] + sides[1] + sides[2]) / 2;
       return (int) Math.sqrt(p * (p-sides[0]) * (p-sides[1]) * (p-sides[2]));
   }
}
