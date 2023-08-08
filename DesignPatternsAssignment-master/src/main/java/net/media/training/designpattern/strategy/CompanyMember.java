package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:14:31 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CompanyMember {
    private String name;
    protected String mgrName;
    protected int salary;
    protected int monthsSpent;

    // Validation strategies
    private ValidationStrategy nameValidator = new LengthValidationStrategy(50);
    private ValidationStrategy salaryValidator = new AtLeastValidationStrategy(1);
    private ValidationStrategy mgrNameValidator = new LengthValidationStrategy(50);

    protected void validate(String value, ValidationStrategy strategy) {
        strategy.validate(value);
    }

    public void setName(String name) {
        validate(name, nameValidator);
        this.name = name;
    }

    public void setSalary(int salary) {
        validate(String.valueOf(salary), salaryValidator);
        this.salary = salary;
    }

    public void setManagerName(String name) {
        validate(name, mgrNameValidator);
        this.mgrName = name;
    }
}