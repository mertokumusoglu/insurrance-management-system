package insurance;

import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double insuranceFee;
    private Date startingDate;
    private Date finishedDate;

    public Insurance(String insuranceName, double insuranceFee, Date startingDate, Date finishedDate) {
        this.insuranceName = insuranceName;
        this.insuranceFee = insuranceFee;
        this.startingDate = startingDate;
        this.finishedDate = finishedDate;
    }
    public abstract void calculate();

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(Date finishedDate) {
        this.finishedDate = finishedDate;
    }
}
