package Learners;

import java.util.ArrayList;

public class Student extends Human {
    private ArrayList<Integer> collegeGpa;
    private ArrayList<Integer> coursework;

    public Student(String name, String gender, int age, ArrayList<Integer> collegeGpa, ArrayList<Integer> coursework) {
        super(name, gender, age);
        this.collegeGpa = collegeGpa;
        this.coursework = coursework;
    }

    public void setCollegeGpa(ArrayList<Integer> collegeGpa) {
        this.collegeGpa = collegeGpa;
    }

    public void setCoursework(ArrayList<Integer> coursework) {
        this.coursework = coursework;
    }

    public ArrayList<Integer> getCollegeGpa() {
        return collegeGpa;
    }

    public ArrayList<Integer> getCoursework() {
        return coursework;
    }

    public String specialScholarshipStudent() {
        int count = 0;
        int amount = 0;
        for (Integer x : getCollegeGpa()) {
            count++;
            amount += x;
        }
        int count2 = 0, amount2 = 0;
        for (Integer x : getCoursework()) {
            count2++;
            amount2 += x;
        }
        if (((double) amount / count >= 4.75) && ((double) amount2 / count2 == 5)) {
            return getName() + " have special scholarship privilege";
        } else
            return getName() + " haven't special scholarship privilege";
    }

    @Override
    public String toString() {
        return new String("Name: " + getName() + "; Gender: " + getGender() + "; Age: " + getAge() + "; Studying at: university/college; Special scholarship: " + specialScholarshipStudent());
    }
}
