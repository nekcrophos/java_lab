package Learners;

import java.util.*;

public class Task {
    public static void main(String[] argc){
        StudentInterface scSt = new StudentInterface();
        ArrayList<Human> allSpecial = new ArrayList<>();
        ArrayList<Schoolboy> schoolboys = new ArrayList<Schoolboy>();
        CreateArrays.Scholars(schoolboys);
        ArrayList<Student> students = new ArrayList<Student>();
        CreateArrays.newStudents(students);

        allSpecial.addAll(scSt.arraySt(students));
        allSpecial.addAll(scSt.arraySc(schoolboys));
        Comparator<Human> compareByLastNames = Comparator.comparing(Human::getLastName);
        allSpecial.sort(compareByLastNames);
        for (Human x: allSpecial)
            System.out.println(x);
        System.out.println("Лучший студент:");
        if (students.isEmpty())
            System.out.println("Nobody");
        else
            System.out.println(scSt.bestSt(students));
        System.out.println("Лучший ученик:");
        if (schoolboys.isEmpty())
            System.out.println("Nobody");
        else
            System.out.println(scSt.bestSc(schoolboys));
        System.out.println("Рейтинг учеников по возрастанию:");
        for (Schoolboy x: scSt.arrayRateSc(schoolboys))
            System.out.println(x);
        Comparator<Schoolboy> compareBySchool = Comparator.comparing(Schoolboy::getSchoolNum);
        schoolboys.sort(compareBySchool);
        System.out.println("Список учеников по номеру школы:");
        for (Schoolboy x: schoolboys)
            System.out.println(x.fullName()+"; Номер школы:"+ x.getSchoolNum());
        System.out.println("Рейтинг студентов по возрастанию:");
        for (Student x: scSt.arrayRateSt(students))
            System.out.println(x);
    }
}
