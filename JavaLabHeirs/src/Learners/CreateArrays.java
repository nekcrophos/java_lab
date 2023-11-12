package Learners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreateArrays {
    public static void Scholars(ArrayList<Schoolboy> schoolboys){
        Scanner sc = new Scanner(System.in);
        String gender;
        String name;
        int age = 0;
        while (true){
            System.out.println("Do you want to add schoolboy? 1/0");
            if (sc.hasNextInt())
            {
                if (sc.nextInt() == 1) {
                    System.out.println("Enter name: ");
                    name = sc.next();
                    System.out.println("Enter gender: ");
                    gender = sc.next();
                    System.out.println("Enter age");
                    if (sc.hasNextInt()) {
                        age = sc.nextInt();
                        if (age <= 0) {
                            System.out.println("Wrong format, try again");
                            sc.next();
                            continue;
                        }
                    }
                    else{
                        System.out.println("Wrong format, try again");
                        sc.next();
                        continue;
                    }
                    System.out.println("Enter grades: ");
                    Map<String, Double> grades = new HashMap<String, Double>();
                    Map<String, Integer> olympiad = new HashMap<String, Integer>();
                    Scholarship.dictSchoolboy(grades, olympiad);
                    Schoolboy freshman = new Schoolboy(name, gender, age, grades, olympiad);
                    schoolboys.add(freshman);
                }
                else
                    break;

            }
            else
            {
                System.out.println("Wrong format, try again");
                sc.next();
            }
        }
    }
    public static void newStudents(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        String gender;
        String name;
        int age = 0;
        while (true){
            System.out.println("Do you want to add student? 1/0");
            if (sc.hasNextInt())
            {
                if (sc.nextInt() == 1) {
                    System.out.println("Enter name: ");
                    name = sc.next();
                    System.out.println("Enter gender: ");
                    gender = sc.next();
                    System.out.println("Enter age");
                    if (sc.hasNextInt()) {
                        age = sc.nextInt();
                        if (age < 17) {
                            System.out.println("Wrong format, try again");
                            sc.next();
                            continue;
                        }
                    }
                    else{
                        System.out.println("Wrong format, try again");
                        sc.next();
                        continue;
                    }
                    System.out.println("Enter grades: ");
                    ArrayList<Integer> gradesStudent = new ArrayList<>();
                    ArrayList<Integer> courseworkStudent = new ArrayList<>();
                    Scholarship.arrayStudent(gradesStudent, courseworkStudent);
                    Student newStudent = new Student(name, gender, age, gradesStudent, courseworkStudent);
                    students.add(newStudent);
                }
                else
                    break;

            }
            else
            {
                System.out.println("Wrong format, try again");
                sc.next();
            }
        }
    }
}
