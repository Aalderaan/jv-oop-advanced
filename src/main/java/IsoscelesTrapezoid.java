import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        super(color,"isosceles trapezoid");
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public String draw() {
        return "Shape: " + getFigure() + ", area: " + getArea() + " sq. units"
                + ", sideA: " + sideA + " units, sideB: " + sideB + " units , height: "
                + height + " units, color: " + getColor();
    }
}
