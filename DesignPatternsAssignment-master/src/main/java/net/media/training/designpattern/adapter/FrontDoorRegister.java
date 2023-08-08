package net.media.training.designpattern.adapter;


public class FrontDoorRegister {
    private LeaveRecord leaveRecord;

    public FrontDoorRegister(LeaveRecord leaveRecord) {
        this.leaveRecord = leaveRecord;
    }

    public String getDisplayWallOfShame() {
        String name = "";
        name = leaveRecord.getMostAbsentEmployee();
        return name + " has been the most absent employee, shame!";
    }
}

