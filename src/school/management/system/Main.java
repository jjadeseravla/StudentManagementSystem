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

        School riverdale = new School(teacherList, studentList);
        tom.payFees(600);
        rob.payFees(1000);
        System.out.println("riverdale has earned £" + riverdale.getTotalMoneyEarned());
        //missJones.getSalary();
        missJones.receiveSalary(missJones.getSalary());
        System.out.println("miss Jones current salary is £" + missJones.getSalary() + " The school now has £" + riverdale.getTotalMoneyEarned() + " left.");
        mrSmith.receiveSalary(mrSmith.getSalary());
        System.out.println("mr Smith current salary is £" + mrSmith.getSalary() + " The school now has £" + riverdale.getTotalMoneyEarned() + " left.");
//        missJones.receiveSalary(35000);
//        System.out.println("miss Jones has a salary of £" + missJones.getSalaryEarned());

        System.out.println(tom);
    }

}
