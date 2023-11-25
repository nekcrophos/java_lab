package Learners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example {
    public static void main(String[] argc){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(5);
        a.add(5);
        b.add(3);
        Student kit = new Student("Kit","B", "Male", 19, a, b);
        System.out.println(kit.getSumWork());
        ArrayList<Integer> ac = new ArrayList<>();
        ArrayList<Integer> bc = new ArrayList<>();
        ac.add(5);
        ac.add(5);
        bc.add(2);
        Student tik = new Student("Tik","A", "Male", 19, ac, bc);
        System.out.println(tik.getSumWork());
        ArrayList<Integer> ad = new ArrayList<>();
        ArrayList<Integer> bd = new ArrayList<>();
        ad.add(4);
        ad.add(4);
        bd.add(2);
        Student nik = new Student("Nik","C", "Male", 19, ad, bd);
        ArrayList<Student> arraySt = new ArrayList<>();
        arraySt.add(kit);
        arraySt.add(tik);
        arraySt.add(nik);
        StudentInterface st = new StudentInterface();
        System.out.println(st.bestSt(arraySt));
        System.out.println(st.arraySt(arraySt));
        System.out.println(kit.compareTo(tik));
        for (Student x: st.arrayRateSt(arraySt))
            System.out.println(x.getSumWork());
    }
}
