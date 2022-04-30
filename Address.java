public class Address //no extension from another class because this is separate
{
private String streetNumAndName;
private String city;
private String state;
private int zipCode;

public Address(String streetNumAndName, String city, String state, int zipCode)
{
    this.streetNumAndName = streetNumAndName;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
}

public String getInfo()
{
    return("\nStreet Number and Name: " + streetNumAndName + "\nCity: " + city + "\nState: " + state + "\nZip Code: " + zipCode);
}
    
}