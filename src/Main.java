import OOP.Triangle;

public class Main {

    public static void main(String[] args) {
        Triangle instance1 = new Triangle(3, 4, 5);
        instance1.showSides();
        instance1.showPerimeter("instance1");
        instance1.showSquare("instance1");
        instance1.setA(-1); // проверка работы свойства set
        System.out.println(instance1.getExist()); // проверка на существование треугольника
    }
}
