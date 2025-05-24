package costexplorer;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CostCalculator {
    public double getMonthlyCost(Plan plan) {
        return round(plan.getAmount());
    }

    public double getYearlyCost(Plan plan) {
        return round(plan.getAmount() * 12);
    }
    public double getMonthlyCost(Plan plan, Double trialDays) {
        return round(plan.getAmount() - getTrialCostTrial(plan, trialDays));
    }

    public double getYearlyCost(Plan plan, Double trialDays) {
        return round(plan.getAmount() * 12 - getTrialCostTrial(plan, trialDays));
    }

    public double getTrialCostTrial(Plan plan, Double trialDays) {
        return round(plan.getAmount() * (trialDays / 30.0));
    }

    private double round(double value) {
        return new BigDecimal(value).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
