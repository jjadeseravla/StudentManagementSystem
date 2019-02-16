package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //constructor creates a new student object by initializing the values
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 10000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    //not going to alter student name or id
    public void setGrade(int grade) {
        this.grade = grade;
    }

    //keep adding the fees to feesPaid field
    public void payFees(int fees) {
        //feesPaid = feesPaid + fees;
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    //return the remaining fees
    public int getRemainingFees() {
        return feesTotal -= feesPaid;
    }

    @Override
    public String toString() {
        return "this student is " + name + " and they have paid £" + feesPaid + " so far.";
    }
}
