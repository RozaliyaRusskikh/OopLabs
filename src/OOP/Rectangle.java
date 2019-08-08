package OOP;

import java.util.Objects;

import static java.lang.Math.sqrt;

public class Rectangle extends Quadrilateral implements Comparable<Rectangle> {

    public Rectangle(int a, int b) { //конструктор с параметрами
        if (a != b) {
            super.setA(a);
            super.setB(b);
            super.setC(a);
            super.setD(b);
            System.out.println("Rectangle has been created.");
        } else {
            System.out.println("You are going to create a square. It is another object");
        }
    }

    @Override
    public void printFigure(String text) { //метод вывода сторон на экран
        System.out.printf("Rectangle sides of " + text + " are %d, %d, %d, %d%n", getA(), getB(), getC(), getD());
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


    @Override
    public double calculateSquare() { //метод вычисления площади
        return getA() * getB();
    }

    @Override
    public void showSquare(String text) { //метод вывода площади
        double tmpSquare = calculateSquare();
        System.out.printf("Square of " + text + " is %.1f%n", tmpSquare);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Rectangle otherRectangle = (Rectangle) o;
        return this.getA() == otherRectangle.getA() && this.getB() == otherRectangle.getB()
                && this.getC() == otherRectangle.getC() && this.getD() == otherRectangle.getD();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC(), getD());
    }

    @Override // переопределение метода toString
    public String toString() {
        return getA() + " " + getB() +  " " + getC() + " " + getD();
    }

    @Override
    public int compareTo(Rectangle o) {// сравнение по стороне A
        if (this.getA() > o.getA()) {
            return 1;
        } else if (this.getA() < o.getA()) {
            return -1;
        } else {
            return 0;
        }
    }

    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}



