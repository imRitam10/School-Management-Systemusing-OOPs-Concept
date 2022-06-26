package SchoolManagementSystem;

/**
 * this class is responsible for keeping all the details of teachers
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * creates a new teacher object
     */
    public Teacher(int id, String name, int salary){
      this.id = id;
      this.name = name;
      this.salary = salary;
      this.salaryEarned = 0;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void updateSalary(int salary){
        this.salary = salary;
    }

    public void receiveSalary(int salary){
        salaryEarned+= salary;
        School.updateTotalMoneySpend(salary); ;
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned $"
                + salaryEarned;
    }
}
