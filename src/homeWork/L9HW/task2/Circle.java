package homeWork.L9HW.task2;

public class Circle extends AbstractFigure {
    private double radius;
    private double square;
    private double perimeter;

    @Override
    public void setSquare() {
        this.square = this.radius * Math.PI;
    }

    @Override
    public void setPerimeter() {
        this.perimeter = this.radius * 2 * Math.PI;
    }

    @Override
    public double getSquare() {
        return this.square;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }

    public Circle(double radius) {
        this.radius = radius;

        setSquare();
        setPerimeter();
    }
}
