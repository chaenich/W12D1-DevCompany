package staff.management;

public class Director extends Manager{

    private Double budget;

    public Director(String name, String niNumber, Double salary, String deptName, Double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public Double payBonus() {
        return getSalary() / 50.0; // 2% bonus for directors
    }

}
