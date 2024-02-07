package lesson11.rect;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 12);
        rect1.setLength(3);
        rect1.setWidth(9);
        System.out.printf("Длина прямоугольника: %d%n", rect1.getLength());
        System.out.printf("Ширина прямоугольника: %d%n", rect1.getWidth());
        System.out.printf("Площадь прямоугольника: %d%n", rect1.getArea());
        System.out.printf("Периметр прямоугольника: %d%n", rect1.getPerimeter());
        System.out.printf("Гипотенуза прямоугольника: %.2f%n", rect1.getHypotenuse());
        rect1.getDraw();

    }
}
