package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.Employee;
import net.media.training.designpattern.adapter.LeaveRecord;
import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class ThirdPartyLeaveRecordAdapter implements LeaveRecord {
    private ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    public ThirdPartyLeaveRecordAdapter(ThirdPartyLeaveRecord thirdPartyLeaveRecord) {
        this.thirdPartyLeaveRecord = thirdPartyLeaveRecord;
    }

    @Override
    public String getMostAbsentEmployee() {
        return thirdPartyLeaveRecord.getMostAbsentEmployee().getName();
    }

    @Override
    public int getEmployeeAbsences(String employeeName) {
        Employee employee = new Employee(employeeName);
        return thirdPartyLeaveRecord.getEmployeeAbsences(employee);
    }
}
