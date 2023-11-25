package Learners;

import java.util.ArrayList;

class StudentInterface implements St, Sc {
    public ArrayList<Student> arraySt(ArrayList<Student> stList){
        ArrayList<Student> listX = new ArrayList<>();
        for (Student x: stList){
            if ((x.specialScholarshipStudent()).equals(x.fullName() + " have special scholarship privilege"))
                listX.add(x);
        }
        if (listX.isEmpty()) {
            System.out.println("Nobody");
            return listX;
        }
        else
            return listX;
    }
    public Student bestSt(ArrayList<Student> st){
        int maxGpa = 0;
        int maxCourseWork = 0;
        Student bSt = st.get(0);
        for (Integer x: st.get(0).getCollegeGpa())
           maxGpa += x;
        for (Integer x: st.get(0).getCoursework())
           maxCourseWork += x;
        for (Student x: st)
        {
            int myGpa = 0;
            int myWork = 0;
            for (Integer y: x.getCollegeGpa())
                myGpa += y;
            for (Integer y: x.getCoursework())
                myWork += y;
            if (myGpa + myWork > maxGpa + maxCourseWork)
            {
                maxGpa = myGpa;
                maxCourseWork =myWork;
                bSt = x;
            }
        }
        return bSt;
    }
    public ArrayList<Student> arrayRateSt(ArrayList<Student> stList){
        stList.sort(Student::compareTo);
        return stList;
    }
    public ArrayList<Schoolboy> arrayRateSc(ArrayList<Schoolboy> scList){
        scList.sort(Schoolboy::compareTo);
        return scList;
    }

    public ArrayList<Schoolboy> arraySc(ArrayList<Schoolboy> scList){
        ArrayList<Schoolboy> listX = new ArrayList<>();
        for (Schoolboy x: scList){
            if ((x.specialScholarship()).equals(x.fullName() + " have special scholarship privilege"))
                listX.add(x);
        }
        if (listX.isEmpty()) {
            System.out.println("Nobody");
            return listX;
        }
        else
            return listX;
    }
    public Schoolboy bestSc(ArrayList<Schoolboy> sc){
        double maxGpa = sc.get(0).getSumGpa();
        Schoolboy bSc = sc.get(0);
        for (Schoolboy x: sc)
        {
            double myGpa = x.getSumGpa();
            if (myGpa > maxGpa)
            {
                maxGpa = myGpa;
                bSc = x;
            }
        }
        return bSc;
    }
}
