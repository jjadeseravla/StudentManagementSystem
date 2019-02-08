package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salary;


    public teacher(int id, int name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

}
