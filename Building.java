public abstract class Building //abstract class to enable polymorphism
{
private double purchaseCost;
private String buildingColor;
private String ownerName;
private Address address; //values from address class are included

public Building(double purchaseCost, String buildingColor, String ownerName, Address address)
{
    this.purchaseCost = purchaseCost;
    this.buildingColor = buildingColor;
    this.ownerName = ownerName;
    this.address = address;
}    

public abstract double calculateVolume(); //abstract

public String getInfo()
{
    return "\nPurchase Cost: $" + purchaseCost + "\nBuilding Color: "
    + buildingColor + "\nOwner Name: " + ownerName + "\nAddress: "
    + address.getInfo() + "\nVolume: " + calculateVolume();
}
}