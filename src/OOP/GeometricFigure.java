package OOP;

public abstract class GeometricFigure {
    private Size size = Size.UNDERFINED;

    public abstract int calculatePerimeter();

    public abstract void showPerimeter(String text);

    public abstract double calculateSquare();

    public abstract void showSquare(String text);

    public void printFigure(String text) {
        System.out.println("Sides of figure");
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
