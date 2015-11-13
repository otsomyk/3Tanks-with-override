package printTheTankInfo;

public class TheTank {
	public String colour;
	public int crew;
	public int maxSpeed;

	public TheTank() {
	}

	public TheTank(String colour, int crew, int maxSpeed) {
		this.colour = colour;
		this.crew = crew;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Tank characteristics:" ;
	}

	public void move() {
		System.out.println("Tank is moving");
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void printTankInfo(TheTank tank) {
		System.out.println("Colour: " + Colour.LIGHT_GREEN + ", Crew: "
				+ tank.getCrew() + ", Max Speed: " + tank.getMaxSpeed());
	}

}
