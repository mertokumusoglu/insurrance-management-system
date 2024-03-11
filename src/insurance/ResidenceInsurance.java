package insurance;

import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String insuranceName, double insuranceFee, Date startingDate, Date finishedDate) {
        super(insuranceName,insuranceFee,startingDate,finishedDate);
    }
    @Override
    public void calculate() {
        System.out.println("Konut sigortası hesaplama");
    }
}
