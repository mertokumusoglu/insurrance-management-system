package user;

import java.util.ArrayList;

import user.User;
import insurance.*;

abstract class Account {
    private User user;
    private ArrayList<Insurance> insuranceList;
    private boolean authenticationStatus;

    public final void showUserInfo() {
        System.out.println("Kullanıcı bilgileri");
    }

    public String getInsuranceList() {
        return this.insuranceList.toArray().toString();
    }
    public void addInsurance(Insurance insurance) {
        this.insuranceList.add(insurance);
    }
}
