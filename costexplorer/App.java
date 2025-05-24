package costexplorer;

public class App {
    public static void main(String[] args) {
        Plan simplePlan = new Plan("Simple", "Simple Plan", 2.0);
        Plan proPlan = new Plan("Pro", "Pro Plan", 4.0);

        CostCalculator calculator = new CostCalculator();
        System.out.println(calculator.getMonthlyCost(simplePlan));
        System.out.println(calculator.getYearlyCost(proPlan));
        System.out.println(calculator.getMonthlyCost(simplePlan, 7.0));
        IPromotion percentPromotion = new PercentPromotion("Summer Sale", 80.0, 1.0);
        System.out.println(percentPromotion.apply(calculator.getMonthlyCost(simplePlan, 7.0)));
    }    
}
