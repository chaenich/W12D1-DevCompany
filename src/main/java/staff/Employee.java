package staff;

public abstract class Employee {
    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !(name.isEmpty())) {
            this.name = name;
        }
    }

    public String getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double salaryRaise) {
        if (salaryRaise > 0) {
            this.salary += salaryRaise;
        }
    }

    public Double payBonus() {
        return this.salary / 100.0; // 1% bonus
    }
}
