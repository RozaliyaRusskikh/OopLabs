package OOP;

import static java.lang.Math.*;

public class Triangle { //поля
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {//конструктор с параметрами для создания экземпляра класса
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() { //конструктор без параметров

    }

    public int getA() { //свойство  для получения значения
        return a;
    }

    public void setA(int value) {  //свойство  для установления значения
        if (value > 0) {
            a = value;
        } else {
            System.out.println("Error! The data is incorrect. There are no tringles with negative side or with zero side.");
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int value) {
        if (value > 0) {
            b = value;
        } else {
            System.out.println("Error! The data is incorrect. There are no tringles with negative side or with zero side.");
        }
    }

    public int getC() {
        return c;
    }

    public void setC(int value) {
        if (value > 0) {
            c = value;
        } else {
            System.out.println("The data is incorrect. There are no tringles with negative side or with zero side.");
        }
    }

    public Boolean getExist() //свойство, позволяющее установить, существует ли треугольник с данными длинами сторон(доступное только для чтения).
    {

        if (getA() + getB() > getC() && getA() + getC() > getB() && getB() + getC() > getA()) {
            return true;
        } else {
            return false;
        }

    }

    public void showSides() { //метод вывода сторон на экран
        System.out.printf("Triangle sides are %d, %d, %d%n", getA(), getB(), getC());
    }

    private int calculatePerimeter() { //метод вычисления периметра
        return getA() + getB() + getC();
    }

    public void showPerimeter(String text) { //метод вывода периметра
        int tmpPerimeter = calculatePerimeter();
        System.out.printf("Perimeter of " + text + " is %d%n", tmpPerimeter);
    }

    private double calculateSquare() { //метод вычисления площади
        double halfPerimeter = (double) ((getA() + getB() + getC()) / 2);
        return sqrt(halfPerimeter * (halfPerimeter - getA()) * (halfPerimeter - getB()) * (halfPerimeter - getC()));
    }

    public void showSquare(String text) { //метод вывода площади
        double tmpSquare = calculateSquare();
        System.out.printf("Square of " + text + " is %.1f%n", tmpSquare);
    }
}
