public class Employee {
    
    private String name;
    private int id;
    private double salary;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   

    public void increaseSalary(double s) {
        this.salary += s;
    }
}
