public class Address {
private static  String street="S-1";
private static  String city="lahore";
private static  String postalCode="L-123";

Address(String street, String city, String postalCode) {
    this.street = street;
    this.city = city;
    this.postalCode = postalCode;
}

public void setStreet(String street) {
    this.street=street;
}
public void setCity(String city) {
        this.city=city;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode=postalCode;
    }
    public String getStreet() {
    return street;
    }
    public String getCity() {
    return city;
    }
    public String getPostalCode() {
    return postalCode;
    }
    public void displayAddress() {
    System.out.println("Street: " + street);
    System.out.println("City: " + city);
    System.out.println("Postal Code: " + postalCode);
    }


}
