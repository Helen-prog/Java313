package lesson14.shape;

public class Square extends Shape {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.side; i++) {
            for (int j = 0; j < this.side; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void info() {
        System.out.printf("=== Квадрат ===%nСторона: %d%nЦвет: %s%nПлощадь: %.1f%nПериметр: %.1f%n", this.side, getColor(), getArea(), getPerimeter());
        draw();
    }
}
