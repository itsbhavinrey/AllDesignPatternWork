package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:37:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends CompanyMember {
    private String managementBand;

    public void setManagementBand(String managementBand) {
        validate(managementBand, new NotEmptyValidationStrategy());
        this.managementBand = managementBand;
    }
}
