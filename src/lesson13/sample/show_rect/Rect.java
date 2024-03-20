package lesson13.sample.show_rect;

public class Rect {
    private int width;
    private int height;

//    public Rect(){};

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void showRect(){
        System.out.printf("*** Прямоугольник ***%nШирина: %d%nВысота: %d", this.width, this.height);
    }
}
