package insurance;

import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceName, double insuranceFee, Date startingDate, Date finishedDate) {
        super(insuranceName,insuranceFee,startingDate,finishedDate);
    }
    @Override
    public void calculate() {
        System.out.println("Seyehat sigortası hesaplama");
    }
}
