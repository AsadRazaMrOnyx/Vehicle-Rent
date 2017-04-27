
public class Reservation {
	
	int ID;
    String name;
    String source;
    String destination;
    
    Reservation()
    {
        ID = 80;
        name = "Asad Raza";
        source = "Nazimabad";
        destination = "Korangi";
    }
    public void showTicket()
    {
        System.out.println("The ID is " + ID);
        System.out.println("The Passenger Name is " + name);
        System.out.println("The Source is " + source);
        System.out.println("The Destination is " + destination);
    }
    public static void main(String ar[])
    {
        Reservation g = new Reservation ();
        g.showTicket();
    }

}
