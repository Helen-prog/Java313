package lesson13.peoples;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Батодалаев", "Даши", 16, "ГК", "Web_011", 5);
        student1.info();
        Student student2 = new Student("Загидуллин", "Линар", 32, "РПО", "PD_011", 5);
        student2.info();
        Graduate graduate = new Graduate("Шугани", "Сергей", 15, "РПО", "PD_011", 5, "Защита персональных данных");
        graduate.info();
        Teacher teacher1 = new Teacher("Даньшин", "Андрей", 38, "Астрофизика", 110);
        teacher1.info();
        Teacher teacher2 = new Teacher("Башкиров", "Алексей", 45, "Разработка приложений", 20);
        teacher2.info();
    }
}
