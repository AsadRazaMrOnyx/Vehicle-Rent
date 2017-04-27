
public class Test {
	 public static void main(String[] args) {
	        Vehicle[] v = new Vehicle[2];
	        v[0] = new Car("red");
	        v[1] = new MotorCycle("black");
	        for (int i=0; i<2; i++) {
	            System.out.println("This is a "+v[i].getName()+" and has "+v[i].getWheels()+" wheels and "+v[i].getGears()+" gears and the color is "+v[i].getColor());
	        }
	    }
}
