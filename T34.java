package printTheTankInfo;

public class T34 extends TheTank {

	@Override
	public String toString() {
		return "T34 moves";
	}

	@Override
	public void move() {
		super.move();
		System.out.println("T34's maxSpeed " + 50 + " km/h" +  " , Colour" + Colour.BLACK);
	}

}
