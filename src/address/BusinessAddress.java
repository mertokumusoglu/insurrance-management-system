package address;

public class BusinessAddress implements IAddress {
    private String country;
    private String city;
    private String street;
    private int postalCode;
    private String companyName;

    public BusinessAddress(String country, String city, String street, int postalCode, String companyName) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.companyName = companyName;
    }
    @Override
    public String getCountry() {
        return country;
    }
    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getCity() {
        return city;
    }
    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getStreet() {
        return street;
    }
    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public int getPostalCode() {
        return postalCode;
    }
    @Override
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void show() {
        System.out.println("Country: " + this.getCountry() +
                " City: " + this.getCity() +
                " Street: " + this.getStreet() +
                " Postal Code: " + this.getPostalCode() +
                " Company Name: " + this.getCompanyName());
    }
}
