package printTheTankInfo;

public class PrintTheTankInfo {

	public static void main(String[] args) {

		BT7 tankBT7 = new BT7();
		tankBT7.move();
		System.out.println(tankBT7.toString());

		T34 tankT34 = new T34();
		tankT34.move();
		System.out.println(tankT34.toString());

		Tiger tankTiger = new Tiger();
		tankTiger.move();
		System.out.println(tankTiger.toString());

		TheTank tank = new TheTank();
		tank.move();
		System.out.println(tank.toString());
		
		tank.printTankInfo(tank);

	}

}
