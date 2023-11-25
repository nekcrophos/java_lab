package Learners;

import java.util.ArrayList;

public class Student extends Human implements Comparable<Student>{
    private ArrayList<Integer> collegeGpa;
    private ArrayList<Integer> coursework;

    public Student(String firstName,String lastName, String gender, int age, ArrayList<Integer> collegeGpa, ArrayList<Integer> coursework) {
        super(firstName, lastName, gender, age);
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

    public int getSumGpa(){
        int itGpa = 0;
        for (Integer x: getCollegeGpa()) {
            itGpa +=x ;
        }
        return itGpa;
    }
    public int getSumCourseWork(){
        int itWork = 0;
        for (Integer x: getCoursework()) {
            itWork +=x ;
        }
        return itWork;
    }
    public int getSumWork(){
        return getSumGpa() + getSumCourseWork();
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
            return fullName() + " have special scholarship privilege";
        } else
            return fullName() + " haven't special scholarship privilege";
    }
    @Override
    public int compareTo(Student newSt){
        return Integer.compare(this.getSumWork(), newSt.getSumWork());
    }
    @Override
    public String toString() {
        return new String("Name: " + fullName() + "; Gender: " + getGender() + "; Age: " + getAge() + "; Studying at: university/college; Special scholarship: " + specialScholarshipStudent());
    }
}
