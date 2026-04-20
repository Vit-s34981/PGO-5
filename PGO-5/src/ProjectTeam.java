import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Employee> employees;

    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
    public void printTeamMembers() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Employee employee : employees) {
            total = total + employee.calculateMonthlyCost();
        }
        return total;
    }

    public Employee findById(String id) {
        for (Employee employee : employees) {
            if(employee.getEmployeeId().equals(id)) {
                System.out.println(employee);
                return employee;
            }
        }
        return null;
    }

    public void printDevelopers() {
        for (Employee employee : employees) {
            if(employee instanceof Developer) {
                System.out.println(employee);
            }
        }
    }
}
