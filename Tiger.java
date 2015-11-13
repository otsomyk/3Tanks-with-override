package printTheTankInfo;

public class Tiger extends TheTank {

	public int armor;

	@Override
	public String toString() {
		return "Tiger moves slowly";
	}

	@Override
	public void move() {
		super.move();
		System.out.println("Tiger's maxSpeed " + 36 + " km/h" +  " , Colour" + Colour.GREY);
	}

	public Tiger() {

	}

}
