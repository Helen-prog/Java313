package lessons17.sample3;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private boolean extrovert;
    private PetPreference petPreference;
    private ArrayList<String> hobbies;

    public Person(String name, int age, boolean extrovert, PetPreference petPreference, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        this.extrovert = extrovert;
        this.petPreference = petPreference;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public boolean isExtrovert() {
        return extrovert;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person(name='" + name + "', age='" + age + "', extrovert='" + extrovert + "', petPreference='" + petPreference + "', hobbies'" + hobbies + "')";
    }
}
