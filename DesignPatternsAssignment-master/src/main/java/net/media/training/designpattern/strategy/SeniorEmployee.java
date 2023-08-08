package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:35:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeniorEmployee extends GenericEmployee {
    private int maxBonus;

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        validate(String.valueOf(salary), new AtLeastValidationStrategy(200));
    }

    @Override
    public void setMonthsSpent(int months) {
        super.setMonthsSpent(months);
        validate(String.valueOf(months), new AtLeastValidationStrategy(60));
    }

    public void setMaxBonus(int bonus) {
        validate(String.valueOf(bonus), new AtLeastValidationStrategy(1));
        this.maxBonus = bonus;
    }
}
