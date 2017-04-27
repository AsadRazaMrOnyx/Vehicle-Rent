
public class Vehicle {
	 private String name;
	    private int wheels;
	    private int gears;
	    private String color;
	    
	    public Vehicle(String name, int wheels, int gears, String color) {
	        setName(name);
	        setWheels(wheels);
	        setGears(gears);
	        setColor(color);
	    }
	    
	  
	    private void setName(String name) {
	        this.name=name;
	    }
	    public String getName() {
	        return this.name;
	    }
	    
	    private void setWheels(int wheels) {
	        this.wheels=wheels;
	    }
	    public int getWheels() {
	        return this.wheels;
	    }
	    
	    private void setGears(int gears) {
	        this.gears=gears;
	    }
	    public int getGears() {
	        return this.gears;
	    }
	    
	    private void setColor(String color) {
	        this.color=color;
	    }
	    public String getColor() {
	        return this.color;
	    }
	}

	
	

