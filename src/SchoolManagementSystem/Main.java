package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1, "IJK", 150000);
        Teacher t2 = new Teacher(2, "EFG", 150000);
        Teacher t3 = new Teacher(3, "ZYX", 150000);

        Student s1 = new Student(1, "ABC" ,  9);
        Student s2 = new Student(2, "XYZ" ,  7);
        Student s3 = new Student(3, "MNO" ,  6);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        School spm = new School(teacherList, studentList);

        System.out.println(" ");
        System.out.println("spm has in account -> $" + spm.getTotalMoneyEarned());
        System.out.println(" ");

        s1.payFees(225000);
        System.out.println(s1);
        System.out.println("spm has earned -> $" + spm.getTotalMoneyEarned());
        System.out.println(" ");

        s2.payFees(225000);
        System.out.println(s2);
        System.out.println("spm has earned -> $" + spm.getTotalMoneyEarned());
        System.out.println(" ");

        s3.payFees(225000);
        System.out.println(s3);
        System.out.println("spm has earned -> $" + spm.getTotalMoneyEarned());
        System.out.println(" ");

        System.out.println("-------------- SPM PAYS SALARY --------------");
        t1.receiveSalary(t1.getSalary());
        System.out.println(t1);
        System.out.println("Now SPM has in account $" + spm.getTotalMoneyEarned());
        System.out.println(" ");


        t2.receiveSalary(t2.getSalary());
        System.out.println(t2);
        System.out.println("Now SPM has in account $" + spm.getTotalMoneyEarned());
        System.out.println(" ");

        t3.receiveSalary(t3.getSalary());
        System.out.println(t3);
        System.out.println("Now SPM has in account $" + spm.getTotalMoneyEarned());
        System.out.println(" ");


    }
}
