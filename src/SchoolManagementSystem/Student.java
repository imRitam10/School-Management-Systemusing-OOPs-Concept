package SchoolManagementSystem;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;
    /**
    to create a new student by initializing.
     fees for every student is 225,000
     fees paid initially 0
     @param id for the student: unique
     @param name for the student name
     @param  grade  for the student
     **/
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;

        this.feesPaid = 0;
        this.totalFees = 225000;
    }

    /**
     * used to update the students grade
     * @param grade
     */

    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * keep adding the fees to feesPaid
     * @param fees the fees that student pays
     */
    public void payFees(int fees){
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

    public int getTotalFees() {
        return totalFees;
    }
    public int getRemainingFees(){
        return totalFees - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :" +name+
                " Total fees paid $"+ feesPaid;
    }

}
