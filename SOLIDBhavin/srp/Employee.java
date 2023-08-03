package srp;

public class Employee {
    protected int empId;
    protected static int TOTAL_LEAVES_ALLOWED = 30;

    protected double monthlySalary;
    protected String name;
    protected String addressStreet;
    protected String addressCity;
    protected String addressCountry;
    protected int leavesTaken;
    protected int totalLeaveAllowed;
    protected int leaveTaken;
    protected String manager;
    protected int yearsInOrg;
    protected int thisYeard;
    protected int[] leavesLeftPreviously;


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }

    
    //other method related to customer
}
