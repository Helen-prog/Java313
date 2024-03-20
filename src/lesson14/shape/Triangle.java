package lesson14.shape;

public class Triangle extends Shape {
    private int side;

    public Triangle(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 3;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3)/4 * Math.pow(this.side, 2);
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.side; i++) {  // i = 1, this.side = 5
            for (int j = i; j < this.side; j++) {  // j = 5, this.side = 5
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {  // j = 0, 0 <= 1
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }

    @Override
    public void info() {
        System.out.printf("=== Равносторонний треугольник ===%nСторона: %d%nЦвет: %s%nПлощадь: %.1f%nПериметр: %.1f%n", this.side, getColor(), getArea(), getPerimeter());
        draw();
    }
}
