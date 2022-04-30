public class CircularSilo extends Building //class extends building class using super
{
    private double radius;
    private double height;

    public CircularSilo(double purchaseCost, String buildingColor, String ownerName, Address address, double radius, double height)
    {
        super(purchaseCost, buildingColor, ownerName, address); //super used to extend the building class
        this.radius = radius;
        this.height = height;
    }

    //Overrides put in place for the calculateVolume method and getInfo method

    @Override
    public double calculateVolume()
    {
        return Math.PI * radius * radius * height; //Math.PI used as shown in the instructions
    }

    @Override
    public String getInfo()
    {
        return super.getInfo() + "\nRadius: " + radius + "\nHeight: " + height;
    }
}
