package lesson13.area_box;

public class Box {
    private double width;
    private double height;

    public Box(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }
}
