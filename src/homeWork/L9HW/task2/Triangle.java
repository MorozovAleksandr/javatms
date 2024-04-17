package homeWork.L9HW.task2;

public class Triangle extends AbstractFigure {
    private double a;
    private double b;
    private double c;
    private double h;
    private double square;
    private double perimeter;

    @Override
    public void setSquare() {
        this.square = 0.5 * a * h;
    }

    @Override
    public void setPerimeter() {
        this.perimeter = a + b + c;
    }

    @Override
    public double getSquare() {
        return square;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }


    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;

        setSquare();
        setPerimeter();
    }
}
