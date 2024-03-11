package address;
import user.User;

public class AddressManager {
    public static void addAdress(User user, IAddress adress) {
        user.getAddressList().add(adress);
    }
    public static void deleteAdress(User user, IAddress adress) {
        user.getAddressList().remove(adress);
    }
}
