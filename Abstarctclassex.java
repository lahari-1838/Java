package ABC;
abstract class car {
	abstract void start();
	abstract void drive();
	void stop() {
		Sysyem.out.println("car is stopped.");
		// TODO Auto-generated method stub

	}

}

class Seatbelt extends car() {
	System.out.println("wearing Seatbelt");
	
}
public class AbstracClassex{
	public static void main(String[] args) {
		Seatbelt sb= new Seatbelt;
	}
	

