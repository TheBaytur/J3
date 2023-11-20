public class Main {
    public static void main(String[] args){
        Figure[] figures = new Figure[3];
        FigureFactory factory = new FigureFactory();
        figures[0] = factory.create(new double[]{2});
        figures[1] = factory.create(new double[]{5,6});
        figures[2] = factory.create(new double[]{3,4,5});

        for (Figure figure : figures){
            print(figure.toString());
        }
    }

    private static void print(String text){
        System.out.println(text);
    }
}

// ООП
// Инкапсуляция
//Наследование
// Полиморфизм
// Переопределять метод toString чтобы понимать с каким объектом имеем дело