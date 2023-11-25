package Learners;

public class Human {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    public Human() {
        firstName = "";
        lastName = "";
        gender = "";
        age = 0;
    }

    public Human(String firstName,String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public Human(Human a) {
        this.firstName = a.firstName;
        this.lastName = a.lastName;
        this.gender = a.gender;
        this.age = a.age;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    public void setFirstName(String newName) {
        firstName = newName;
    }
    public void setLastName(String newName) {
        lastName = newName;
    }
    public void setGender(String newGender) {
        gender = newGender;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public String fullName(){
        return firstName + " " + lastName;
    }
    @Override
    public String toString() {
        return new String("Name: " + fullName() + "Gender" + gender + " Age:" + age);
    }
}