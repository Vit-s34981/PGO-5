public class Developer extends Employee {
    private String mainLanguage;
    private int repositoryCount;

    public Developer(String employeeId, String firstName, String lastName, double baseSalary, String mainLanguage, int repositoryCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }

    public void printTechnologies() {
        System.out.println("Technologies");
    }

    @Override
    public String introduceYourself() {
        return "Hello IM A DEVELOPER and my name is " + getFirstName() + " " + getLastName() + " and my id is " + getEmployeeId();
    }

    @Override
    public double calculateMonthlyCost() {
        return super.calculateMonthlyCost();
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    public int getRepositoryCount() {
        return repositoryCount;
    }

    public void setRepositoryCount(int repositoryCount) {
        this.repositoryCount = repositoryCount;
    }
}
