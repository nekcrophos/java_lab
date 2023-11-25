package Learners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreateArrays {
    public static void Scholars(ArrayList<Schoolboy> schoolboys){
        Scanner sc = new Scanner(System.in);
        String gender;
        int age = 0;
        int schoolNum = 0;
        while (true){
            System.out.println("Do you want to add schoolboy? 1/0");
            if (sc.hasNextInt())
            {
                if (sc.nextInt() == 1) {
                    System.out.println("Enter first name: ");
                    String firstName = sc.next();
                    try {
                        itName(firstName);
                    }
                    catch (CustomException e) {
                        System.out.println("Error: " + e.getMessage());
                        continue;
                    }
                    System.out.println("Enter last name: ");
                    String lastName = sc.next();
                    try {
                        itSurname(lastName);
                    }
                    catch (CustomException e){
                        System.out.println("Error: " + e.getMessage());

                        continue;
                    }
                    System.out.println("Enter gender: ");
                    gender = sc.next();
                    System.out.println("Enter age:");
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
                    System.out.println("Enter school number:");
                    if (sc.hasNextInt()) {
                        schoolNum = sc.nextInt();
                        if (schoolNum <= 0) {
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
                    Schoolboy freshman = new Schoolboy(firstName, lastName, gender, age, grades, olympiad, schoolNum);
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
        int age = 0;
        while (true){
            System.out.println("Do you want to add student? 1/0");

            if (sc.hasNextInt())
            {
                if (sc.nextInt() == 1) {
                        System.out.println("Enter first name: ");
                        String firstName = sc.next();
                        try {
                            itName(firstName);
                        }
                        catch (CustomException e) {
                            System.out.println("Error: " + e.getMessage());
                            continue;
                        }
                        System.out.println("Enter last name: ");
                        String lastName = sc.next();
                        try {
                            itSurname(lastName);
                        }
                        catch (CustomException e){
                            System.out.println("Error: " + e.getMessage());
                            continue;
                        }
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
                    Student newStudent = new Student(firstName, lastName, gender, age, gradesStudent, courseworkStudent);
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
    private static void itName(String firstName) throws CustomException{
        if (!Character.isUpperCase(firstName.charAt(0))){
            throw new CustomException("The name must start with an upper case letter");
        }
    }
    private static void itSurname(String lastName) throws CustomException{
        if (!Character.isUpperCase(lastName.charAt(0))){
            throw new CustomException("The surname must start with an upper case letter");
        }
    }
}
