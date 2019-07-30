package OOP;

public abstract class GeometricFigure {
    public abstract int calculatePerimeter();

    public abstract void showPerimeter(String text);

    public abstract double calculateSquare();

    public abstract void showSquare(String text);

    public void printFigure() {
        System.out.println("Figure");
    }
}
