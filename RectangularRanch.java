public class RectangularRanch extends Building //class extends building class using super
{
    private double length;
    private double width;
    private double height;

    public RectangularRanch(double purchaseCost, String buildingColor, String ownerName, Address address, double length, double width, double height) 
    {
       super(purchaseCost, buildingColor, ownerName, address); //super values used for the building class
       this.length = length;
       this.width = width;
       this.height = height;
    }

    @Override
    public String getInfo()
    {
       return super.getInfo() + "\nLength: " + length + "\nWidth: " + width + "\nHeight: " + height;
    }
  
    @Override
    public double calculateVolume() 
    {
       return length * width * height;
    }
}
