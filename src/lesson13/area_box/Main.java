package lesson13.area_box;

public class Main {
    public static void main(String[] args) {
        Box3D box = new Box3D(5, 3, 2);
        System.out.println(box.get3DInfo());
        System.out.println(box.get3DArea());
        box.setWidth(10);
        System.out.println(box.getWidth());
        System.out.println(box.get3DInfo());
        System.out.println(box.get3DArea());
    }
}
