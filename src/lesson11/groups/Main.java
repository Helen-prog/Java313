package lesson11.groups;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Student students[] = new Student[n];
        students[0] = new Student("Петров", "А.В.", 1);
        students[1] = new Student("Петров", "В.И.", 1);
        students[2] = new Student("Иванов", "А.К.", 1);
        students[3] = new Student("Вербов", "А.В.", 2);
        students[4] = new Student("Долгих", "В.А.", 2);
        students[5] = new Student("Шишкин", "А.К.", 3);
        students[6] = new Student("Репков", "Н.В.", 3);
        students[7] = new Student("Матрешкина", "А.В.", 3);
        students[8] = new Student("Волков", "Л.В.", 3);
        students[9] = new Student("Колганов", "А.В.", 3);

        System.out.println("Все студенты: ");
        for (int s = 0; s < students.length; s++) {
            students[s].print();
        }
    }
}
