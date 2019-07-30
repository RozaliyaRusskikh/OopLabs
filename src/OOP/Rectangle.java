package OOP;

import static java.lang.Math.sqrt;

public class Rectangle extends GeometricFigure {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void printFigure() { //метод вывода сторон на экран
        System.out.printf("Rectangle sides are %d, %d%n", getA(), getB());
    }

    @Override
    public int calculatePerimeter() { //метод вычисления периметра
        return (getA() + getB()) * 2;
    }

    @Override
    public void showPerimeter(String text) { //метод вывода периметра
        int tmpPerimeter = calculatePerimeter();
        System.out.printf("Perimeter of " + text + " is %d%n", tmpPerimeter);
    }

    public Rectangle(int a) {
        this.a = a;
        this.b = a;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateSquare() { //метод вычисления площади
        return getA() * getB();
    }

    @Override
    public void showSquare(String text) { //метод вывода площади
        double tmpSquare = calculateSquare();
        System.out.printf("Square of " + text + " is %.1f%n", tmpSquare);
    }


}
