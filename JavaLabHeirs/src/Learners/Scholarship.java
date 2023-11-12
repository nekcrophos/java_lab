package Learners;

import java.util.*;

public class Scholarship {
    public static void main(String[] argc) {
//        Map <String, Double> a = new HashMap<String, Double>();
//        Map <String, Integer> b = new HashMap<String, Integer>();
//        dictSchoolboy(a, b);
//        Schoolboy l = new Schoolboy("Ivan", "Male", 16, a, b);
//        System.out.println(l.specialScholarship());
//        loh.specialScholarship();
//        ArrayList<Integer> gradesStudent = new ArrayList<>();
//        ArrayList<Integer> courseworkStudent = new ArrayList<>();
//        arrayStudent(gradesStudent, courseworkStudent);
//        Student c = new Student("Igor", "Male", 21, gradesStudent, courseworkStudent);
//        System.out.println(c.specialScholarshipStudent());
        ArrayList<Schoolboy> schoolboys = new ArrayList<Schoolboy>();
        ArrayList<Human> allSc = new ArrayList<Human>();
        CreateArrays.Scholars(schoolboys);
        for (Schoolboy x: schoolboys){
            if (Objects.equals(x.getGender(), "Female") && (x.getActivity().get("City") == 1 || x.getActivity().get("School") == 1)){
                System.out.println(x);
            }
            if (Objects.equals(x.specialScholarship(), x.getName() + " have special scholarship privilege"))
                allSc.add(x);
        }

        ArrayList<Student> students = new ArrayList<Student>();
        CreateArrays.newStudents(students);
        for (Student x: students){
            if (!x.getCoursework().isEmpty())
                System.out.println(x);
            if (Objects.equals(x.specialScholarshipStudent(), x.getName() + " have special scholarship privilege"))
                allSc.add(x);
        }
        System.out.println();
        for (Human x: allSc)
            System.out.println(x);
    }

    public static void dictSchoolboy(Map <String, Double> a, Map <String, Integer> b){
        Scanner sc = new Scanner(System.in);
        double value;
        while (true){
            System.out.println("Insert Math grade: ");
            if (sc.hasNextInt() || sc.hasNextDouble()) {
                value = Double.parseDouble(sc.next());
                a.put("Math", value);
            }
            else{
                System.out.println("Wrong format, try again!");
                sc.next();
                continue;
            }
            System.out.println("Insert Russian grade: ");
            if (sc.hasNextInt() || sc.hasNextDouble()) {
                value = Double.parseDouble(sc.next());
                a.put("Russian", value);
            }
            else{
                sc.next();
                continue;
            }
            System.out.println("Insert History grade: ");
            if (sc.hasNextInt() || sc.hasNextDouble()) {
                value = Double.parseDouble(sc.next());
                a.put("History", value);
            }
            else{
                System.out.println("Wrong format, try again!");
                sc.next();
                continue;
            }
            System.out.println("Insert English grade: ");
            if (sc.hasNextInt() || sc.hasNextDouble()) {
                value = Double.parseDouble(sc.next());
                a.put("English", value);
            }
            else{
                System.out.println("Wrong format, try again!");
                sc.next();
                continue;
            }
            System.out.println("Insert an arithmetic mean of others subjects: ");
            if (sc.hasNextInt()) {
                value = Double.parseDouble(sc.next());
                a.put("Others", value);

            }
            else{
                if (sc.hasNextDouble())
                    a.put("Others", sc.nextDouble());
                else {
                    System.out.println("Wrong format, try again!");
                    sc.next();
                    continue;
                }
            }
            break;
        }
        int value2;
        while (true) {
            System.out.println("Insert your place on school olympiad (if you haven't participated enter '0'): ");
            if (sc.hasNextInt()) {
                value2 = Integer.parseInt(sc.next());
                b.put("School", value2);
            } else {
                System.out.println("Wrong format, try again");
                sc.next();
                continue;
            }
            System.out.println("Insert your place on city olympiad (if you haven't participated enter '0'): ");
            if (sc.hasNextInt()) {
                value2 = Integer.parseInt(sc.next());
                b.put("City", value2);
            } else {
                System.out.println("Wrong format, try again");
                sc.next();
                continue;
            }
            break;
        }
    }
    public static void arrayStudent(ArrayList<Integer> gradesStudent, ArrayList<Integer> courseworkStudent){
        Scanner sc = new Scanner(System.in);
        int amountOfCoursework, amountOfSub;
        while (true){
            System.out.println("Enter how much exams you have had: ");
            if (sc.hasNextInt())
                amountOfSub = sc.nextInt();
            else{
                System.out.println("Wrong format, try again");
                sc.next();
                continue;
            }
            break;
        }
        while (true){
            System.out.println("Enter how much coursework you have had: ");
            if (sc.hasNextInt())
                amountOfCoursework = sc.nextInt();
            else{
                System.out.println("Wrong format, try again");
                sc.next();
                continue;
            }
            break;
        }
        while (amountOfSub != 0){
            System.out.println("Enter an exam grade: ");
            if (sc.hasNextInt())
                gradesStudent.add(Integer.parseInt(sc.next()));
            else{
                System.out.println("Wrong format, try again");
                sc.next();
                continue;
            }
            amountOfSub--;
        }
        while (amountOfCoursework != 0){
            System.out.println("Enter a coursework grade: ");
            if (sc.hasNextInt())
                courseworkStudent.add(Integer.parseInt(sc.next()));
            else{
                System.out.println("Wrong format, try again");
                sc.next();
                continue;
            }
            amountOfCoursework--;
        }
    }
}
