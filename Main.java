import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        ArrayList<Building> bldg = new ArrayList<Building>();
        
        //hard-coded values instead of scanner

        Address a1 = new Address("12677 Clearview Drive", "Monument", "Colorado", 80920);
        Address a2 = new Address("767 Beaver Road", "State College", "Pennsylvania", 16803);
        Address a3 = new Address("2600 Sandy Avenue", "Glendale", "Arizona", 13490);
        Address a4 = new Address("19189 Sunny Road", "Roanoke", "Virginia", 20061);

        CircularSilo c1 = new CircularSilo(10000, "Gray", "David", a1, 6, 12);
        CircularSilo c2 = new CircularSilo(11000, "White", "Samantha", a2, 7, 14);

        RectangularRanch r1 = new RectangularRanch(13000, "Green", "Robert", a3, 30, 24, 12);
        RectangularRanch r2 = new RectangularRanch(9600, "Blue", "Gary", a4, 25, 13, 11);

        //adds hard-coded values into the arraylist

        bldg.add(c1);
        bldg.add(c2);
        bldg.add(r1);
        bldg.add(r2);

        for(int i = 0; i < bldg.size(); i++) //for the arraylist size, the arraylist will print from the respective getInfo
        {
            System.out.println(bldg.get(i).getInfo());
        }
    }
    
}
