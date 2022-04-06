package CarSpeed;

import testPackage.Car_class;

public class KoreaCarSpeed implements InterfaceCarSpeed {
	
	private static final int MAX_SPEED = 120;
	
    @Override
    public int speed(int speed) {
        return Math.min(MAX_SPEED, speed);
    }

	public static void main(String[] args) {
		
		KoreaCarSpeed koreaCarSpeed = new KoreaCarSpeed();
		koreaCarSpeed.speed(MAX_SPEED);
		System.out.println(koreaCarSpeed.speed(MAX_SPEED));

	}

	public static int getMaxSpeed() {
		return MAX_SPEED;
	}

}
