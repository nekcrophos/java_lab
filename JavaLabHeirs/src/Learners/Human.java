package Learners;

public class Human {
    private String name;
    private String gender;
    private int age;

    public Human() {
        name = "";
        gender = "";
        age = 0;
    }

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Human(Human a) {
        this.name = a.name;
        this.gender = a.gender;
        this.age = a.age;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }
    public void setGender(String newGender) {
        gender = newGender;
    }
    public void setAge(int newAge) {
        age = newAge;
    }

    @Override
    public String toString() {
        return new String("Name: " + name + "Gender" + gender + " Age:" + age);
    }
}