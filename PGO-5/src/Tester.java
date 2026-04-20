public class Tester extends Employee {
    private boolean automationTester;
    private int scenarioCount;

    public Tester(String employeeId, String firstName, String lastName, double baseSalary, boolean automationTester, int scenarioCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    public void runTestingReport() {
        System.out.println("Testing report is running");
    }

    @Override
    public String introduceYourself() {
        return "Hello IM A TESTER and my name is " + getFirstName() + " " + getLastName() + " and my id is " + getEmployeeId();
    }

    @Override
    public double calculateMonthlyCost() {
        return super.calculateMonthlyCost();
    }

    public boolean isAutomationTester() {
        return automationTester;
    }

    public void setAutomationTester(boolean automationTester) {
        this.automationTester = automationTester;
    }

    public int getScenarioCount() {
        return scenarioCount;
    }

    public void setScenarioCount(int scenarioCount) {
        this.scenarioCount = scenarioCount;
    }
}
