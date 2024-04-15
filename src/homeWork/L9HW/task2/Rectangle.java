package homeWork.L9HW.task2;

public class Rectangle extends AbstractFigure {
    private double a;
    private double b;
    private double square;
    private double perimeter;

    @Override
    public void setSquare() {
        this.square = this.a * this.b;
    }

    @Override
    public void setPerimeter() {
        this.perimeter = (this.a + this.square) * 2;
    }

    @Override
    public double getSquare() {
        return this.square;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        setSquare();
    }
}
