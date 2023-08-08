package net.media.training.designpattern.adapter;


public class SalaryDisberser {
    private LeaveRecord leaveRecord;
    private int SALARY = 15000;

    public SalaryDisberser(LeaveRecord leaveRecord) {
        this.leaveRecord = leaveRecord;
    }

    public int salary(String employeeName) {
        return SALARY - leaveRecord.getEmployeeAbsences(employeeName) * 1000;
    }
}


