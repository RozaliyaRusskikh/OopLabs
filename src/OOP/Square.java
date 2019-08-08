package OOP;

import java.util.Objects;

public class Square extends Quadrilateral {

    public Square(int a) { //конструктор для квадрата
        super.setA(a);
        super.setB(a);
        super.setC(a);
        super.setD(a);
        System.out.println("Square has been created.");
    }

    @Override
    public void printFigure(String text) { //метод вывода сторон на экран
        System.out.printf("Square sides of " + text + " are %d, %d, %d, %d%n", getA(), getB(), getC(), getD());
    }

    @Override
    public int calculatePerimeter() { //метод вычисления периметра
        return 4 * getA();
    }

    @Override
    public void showPerimeter(String text) { //метод вывода периметра
        int tmpPerimeter = calculatePerimeter();
        System.out.printf("Perimeter of " + text + " is %d%n", tmpPerimeter);
    }


    @Override
    public double calculateSquare() { //метод вычисления площади
        return Math.pow(getA(), 2);
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
        Square otherSquare = (Square) o;
        return this.getA() == otherSquare.getA() && this.getB() == otherSquare.getB()
                && this.getC() == otherSquare.getC() && this.getD() == otherSquare.getD();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC(), getD());
    }

    @Override // переопределение метода toString
    public String toString() {
        return getA() + " " + getB() + getC() + " " + getD();
    }
}
