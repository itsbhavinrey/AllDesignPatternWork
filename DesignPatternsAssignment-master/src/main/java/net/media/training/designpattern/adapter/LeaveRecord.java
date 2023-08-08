package net.media.training.designpattern.adapter;


public interface LeaveRecord {
    
    String getMostAbsentEmployee();

    int getEmployeeAbsences(String employeeName);
}
