package insurance;

import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String insuranceName, double insuranceFee, Date startingDate, Date finishedDate) {
        super(insuranceName,insuranceFee,startingDate,finishedDate);
    }
    @Override
    public void calculate() {
        System.out.println("Sağlık sigortası hesaplama");
    }
}
