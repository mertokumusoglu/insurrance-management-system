package address;

public interface IAddress {
    public String getCountry();
    public void setCountry(String country);

    public String getCity();
    public void setCity(String city);

    public String getStreet();
    public void setStreet(String street);

    public int getPostalCode();
    public void setPostalCode(int postalCode);

    public void show();
}
