package insurance;

import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(String insuranceName, double insuranceFee, Date startingDate, Date finishedDate) {
        super(insuranceName,insuranceFee,startingDate,finishedDate);
    }
    @Override
    public void calculate() {
        System.out.println("Araba sigortası hesaplama");
    }
}
