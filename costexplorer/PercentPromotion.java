package costexplorer;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentPromotion implements IPromotion{
    String description;
    Double discountPercent;
    Double discountLimit;
    

    public PercentPromotion(String description, Double discountPercent, Double discountLimit) {
        this.description = description;
        this.discountPercent = discountPercent;
        this.discountLimit = discountLimit;
    }


    @Override
    public double apply(Double amount) {
        Double discountedAmout = Math.min((discountPercent*amount)/100.0 , discountLimit); 
        return new BigDecimal(amount - discountedAmout).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

}