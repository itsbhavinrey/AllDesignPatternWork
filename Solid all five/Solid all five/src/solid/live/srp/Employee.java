package solid.live.srp;


public class Employee {

    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;
    private int[] leavesLeftPreviously;


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



    String getEmployeeName(){
        return this.name;
    }

    int getEmployeeID(){
        return this.empId;
    }

    String getManager(){
        return this.manager;
    }

   double getSalary(){
        return this.monthlySalary;
    }

    int getLeavesTaken(){
        return this.leavesTaken;
    }

    int[] getLeavesLeftPreviously(){
        return this.leavesLeftPreviously;
    }
    int getTotalLeavesAllowed(){
      return this.totalLeaveAllowed;
    }

    int getYearsInOrg(){
        return this.yearsInOrg;
    }


    public double getMonthlySalary() {
        return this.monthlySalary;
    }
}


class LeaveCalculator{

    public static int getTotalLeaveLeftPreviously(int[] leavesLeftPreviously,int yearsInOrg){
        int years = 3;
        if (yearsInOrg < 3) {
            years = yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }



}

 class EmployeeHTMLGenerator{

    public static String toHtml(Employee employee) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmployeeID() + "'>" +
                "<span>" + employee.getEmployeeName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employee.getTotalLeavesAllowed() - employee.getLeavesTaken()) + "</span>";
        str += "<span>" + Math.round(employee.getMonthlySalary() * 12) + "</span>";

        String manager = employee.getManager();
        if (manager != null) str += "<span>" + manager + "</span>";
        else str += "<span>None</span>";



        str += "<span>" + LeaveCalculator.getTotalLeaveLeftPreviously(employee.getLeavesLeftPreviously(),employee.getYearsInOrg()) + "</span>";
        return str + "</div> </div>";
    }

}