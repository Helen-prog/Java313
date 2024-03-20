package lessons15;

public class Main {
    public static void main(String[] args) {
        System.out.println(Seasons.WINTER);
        System.out.println(Seasons.SUMMER);
        System.out.println(Seasons.SPRING);
        System.out.println(Seasons.AUTUMN);
        System.out.println();
        for (Seasons s : Seasons.values()) {
            System.out.println(s);
        }
        Seasons arg = Seasons.WINTER;
        switch (arg) {
            case WINTER:
                System.out.println("Сейчас зима!");
                break;
            case SUMMER:
                System.out.println("Сейчас лето!");
                break;
            case SPRING:
                System.out.println("Уже весна!");
                break;
            case AUTUMN:
                System.out.println("Уже осень!");
                break;
        }
    }
}

enum Seasons {
    WINTER,  // public static final
    SUMMER,
    SPRING,
    AUTUMN;
}
