package Learners;

import java.util.HashMap;
import java.util.Map;

public class Schoolboy extends Human {
    private Map<String, Double> gpa = new HashMap<String, Double>();
    private Map<String, Integer> activity = new HashMap<String, Integer>();

    public Schoolboy(String name, String gender, int age, Map<String, Double> gpa, Map<String, Integer> activity) {
        super(name, gender, age);
        this.gpa = gpa;
        this.activity = activity;

    }

    public Map<String, Double> getGpa() {
        return gpa;
    }

    public Map<String, Integer> getActivity() {
        return activity;
    }

    public void setGpa(Map<String, Double> newGpa) {
        gpa = newGpa;
    }

    public void setActivity(Map<String, Integer> newActivity) {
        activity = newActivity;
    }

    public String specialScholarship() {
        if ((getGpa().get("Math") == 5) && (getGpa().get("Russian") == 5)
                && (getGpa().get("History") == 5) && (getGpa().get("English") == 5)
                && (getGpa().get("Others") >= 4) && (getActivity().get("School") == 1 || (getActivity().get("City") == 1 ||
                getActivity().get("City") == 2 || getActivity().get("City") == 3)))
            return getName() + " have special scholarship privilege";
        else
            return getName() + " haven't special scholarship privilege";
    }

    @Override
    public String toString() {
        return new String("Name: " + getName() + "; Gender: " + getGender() + "; Age: " + getAge() + "; Studying at: school; Special scholarship: " + specialScholarship());
    }
}
