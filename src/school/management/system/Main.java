package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher missJones = new Teacher(1, "missJones", 500, 300);
        Teacher mrSmith = new Teacher(2, "mrSmith", 700, 300);
        Teacher mrBrown = new Teacher(3, "mrBrown", 600, 300);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(missJones);
        teacherList.add(mrSmith);
        teacherList.add(mrBrown);

        Student tom = new Student(1, "tom", 3);
        Student rob = new Student(2, "rob", 2);
        Student lily = new Student(3, "lily", 4);

        List<Student> studentList = new ArrayList<>();

        studentList.add(tom);
        studentList.add(rob);
        studentList.add(lily);

        //tom.payFees(200);

        School riverdale = new School(teacherList, studentList);
        tom.payFees(200);
        System.out.println("riverdale has earned £: " + riverdale.getTotalMoneyEarned());
        System.out.println("blabla");
    }

}
