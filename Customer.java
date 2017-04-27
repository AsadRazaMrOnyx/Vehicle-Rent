
public class Customer {
	private int id;
	private String name;
	private String address;
	private int age;
	public Customer()
	{
	    
	}
	public Customer(int id, String name, String address, int age)
	{
	   this.id=id;
	   this.name=name;
	   this.address=address;
	   this.age=age; 
	}
	public String toString()
	{
	   return ("Id: "+this.id+" | Name: "+this.name+" | Address: "+this.address+" | Age: "+this.age+"");
	}
	    public static void main(String[] args) {
	        Customer ct1 = new Customer(100, "Asad", "123 Street", 30);
	        Customer ct2 = new Customer(300, "Zahid", "P-24 Road", 27);
	        Customer ct3 = new Customer(200, "Ammad", "Hill Street", 21);
	        Customer ct4 = new Customer(400, "Waqas", "Burger Lane", 40);
	        System.out.println(ct1);
	        System.out.println(ct3);
	        System.out.println(ct2);
	        System.out.println(ct4);
	    }
}
