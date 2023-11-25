package Learners;

import java.util.HashMap;
import java.util.Map;

public class Schoolboy extends Human implements Comparable<Schoolboy> {
    private Map<String, Double> gpa = new HashMap<String, Double>();
    private Map<String, Integer> activity = new HashMap<String, Integer>();
    int schoolNum;

    public Schoolboy(String firstName, String lastName, String gender, int age, Map<String, Double> gpa, Map<String, Integer> activity, int schoolNum) {
        super(firstName, lastName, gender, age);
        this.gpa = gpa;
        this.activity = activity;
        this.schoolNum = schoolNum;
    }

    public Map<String, Double> getGpa() {
        return gpa;
    }

    public Map<String, Integer> getActivity() {
        return activity;
    }

    public int getSchoolNum() {
        return schoolNum;
    }

    public void setGpa(Map<String, Double> newGpa) {
        gpa = newGpa;
    }

    public void setActivity(Map<String, Integer> newActivity) {
        activity = newActivity;
    }

    public void setSchoolNum(int num){
        schoolNum = num;
    }

    public double getSumGpa() {
        double sumGpa = 0;
        for (Double x : getGpa().values())
            sumGpa += x;
        return sumGpa;
    }

    public String specialScholarship() {
        if ((getGpa().get("Math") == 5) && (getGpa().get("Russian") == 5)
                && (getGpa().get("History") == 5) && (getGpa().get("English") == 5)
                && (getGpa().get("Others") >= 4) && (getActivity().get("School") == 1 || (getActivity().get("City") == 1 ||
                getActivity().get("City") == 2 || getActivity().get("City") == 3)))
            return fullName() + " have special scholarship privilege";
        else
            return fullName() + " haven't special scholarship privilege";
    }

    @Override
    public int compareTo(Schoolboy newSc) {
        return Double.compare(this.getSumGpa(), newSc.getSumGpa());
    }

    @Override
    public String toString() {
        return new String("Name: " + fullName() + "; Gender: " + getGender() + "; Age: " + getAge() + "; Studying at: school; Special scholarship: " + specialScholarship());
    }
}
