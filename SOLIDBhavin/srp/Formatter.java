package srp;

public class Formatter {
    
    protected Employee employee;

    Formatter (Employee employee){
        this.employee = employee;
    }

    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.empId + "'>" +
                "<span>" + employee.name + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employee.totalLeaveAllowed - employee.leaveTaken) + "</span>";
        str += "<span>" + Math.round(employee.monthlySalary * 12) + "</span>";
        if (employee.manager != null) str += "<span>" + employee.manager + "</span>";
        else str += "<span>None</span>";
        int years = 3;
        if(employee.yearsInOrg < 3) {
            years = employee.yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += employee.leavesLeftPreviously[yearsInOrg-i-1];
        }
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}
