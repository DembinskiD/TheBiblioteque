package pl.biblioteka.biblioteka;

public class Address {
    private String street;
    private String city;
    private String coutry;
    private String country;
    private String postCode;

    public Address(String street, String city, String coutry, String country, String postCode) {
        this.street = street;
        this.city = city;
        this.coutry = coutry;
        this.country = country;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
