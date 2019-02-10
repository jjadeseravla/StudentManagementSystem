package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    public Teacher(int id, String name, int salary, int salaryEarned) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    //getter to return name
    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getSalary() {
        return this.salary;
    }

    //set the salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //removes from total money earned by the school and adds the salary
    public void receiveSalary(int salary) {
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

}
