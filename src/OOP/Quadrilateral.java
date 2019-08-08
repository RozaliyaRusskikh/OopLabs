package OOP;

public abstract class Quadrilateral extends GeometricFigure {
    private int a;
    private int b;
    private int c;
    private int d;


    public int getA() {
        return a;
    }

    void setA(int a) {
        this.a = a;
    }

    int getB() {
        return b;
    }

    int getC() {
        return c;
    }

    int getD() {
        return d;
    }

    void setB(int b) {
        this.b = b;
    }

    void setC(int c) {
        this.c = c;
    }

    void setD(int d) {
        this.d = d;
    }
}
