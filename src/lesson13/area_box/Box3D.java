package lesson13.area_box;

public class Box3D extends Box {
    private double depth;

    public Box3D(double width, double height, double depth) {
        super(width, height);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        if (depth > 0)
            this.depth = depth;
    }

    public String get3DInfo() {
        return "Объект Dox3D (ширина = " + getWidth() + ", высота = " + getHeight() + ", глубина = " + this.depth + ")";
    }

    public double get3DArea(){
        double area2D = getArea();
        System.out.print("Объем: ");
        return area2D * this.depth;
    }
}
