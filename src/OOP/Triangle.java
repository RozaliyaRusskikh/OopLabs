package OOP;

import java.util.Objects;

import static java.lang.Math.*;

public class Triangle extends GeometricFigure implements Comparable<Triangle>, Cloneable { //поля
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {//конструктор с параметрами для создания экземпляра класса и проверкой на существование треугольника
        if ((a + b > c && a + c > b && b + c > a)) {
            this.a = a;
            this.b = b;
            this.c = c;
            System.out.println("Triangle has been created.");
        } else {
            System.out.println("Triangle with such sides does not exist.");
        }
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

    @Override
    public void printFigure(String text) { //метод вывода сторон на экран
        System.out.printf("Triangle sides of " + text + " are %d, %d, %d%n", getA(), getB(), getC());
    }

    @Override
    public int calculatePerimeter() { //метод вычисления периметра
        return getA() + getB() + getC();
    }

    @Override
    public void showPerimeter(String text) { //метод вывода периметра
        int tmpPerimeter = calculatePerimeter();
        System.out.printf("Perimeter of " + text + " is %d%n", tmpPerimeter);
    }

    @Override
    public double calculateSquare() { //метод вычисления площади
        double halfPerimeter = (double) ((getA() + getB() + getC()) / 2);
        return sqrt(halfPerimeter * (halfPerimeter - getA()) * (halfPerimeter - getB()) * (halfPerimeter - getC()));
    }

    @Override
    public void showSquare(String text) { //метод вывода площади
        double tmpSquare = calculateSquare();
        System.out.printf("Square of " + text + " is %.1f%n", tmpSquare);
    }

    @Override // переопределение метода Equals
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Triangle otherTriangle = (Triangle) o;
        return this.getA() == otherTriangle.getA() && this.getB() == otherTriangle.getB() && this.getC() == otherTriangle.getC();
    }


    @Override // переопределение метода hashCode
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }

    @Override // переопределение метода toString
    public String toString() {
        return getA() + " " + getB() + " " + getC();
    }

    @Override
    public int compareTo(Triangle o) { // сравнение по стороне A путем реализации метода
        if (this.getA() > o.getA())
            return 1;
        else if (this.getA() < o.getA())
            return -1;
        else
            return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Triangle) super.clone();
    }
}

