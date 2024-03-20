package lesson13.peoples;

public class Human {
    private String lastName, firstName;
    private int age;

    public Human(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public void info(){
        System.out.print("\n" + this.lastName + " " + this.firstName + " " + this.age + " ");
    }
}
