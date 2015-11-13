package printTheTankInfo;

public class BT7 extends TheTank {

	@Override
	public String toString() {
		return "BT7 moves";

	}

	@Override
	public void move() {
		super.move();
		System.out.println("BT7's maxSpeed " + 72 + " km/h" +  " , Colour" + Colour.DARK_GREEN);

	}

}
