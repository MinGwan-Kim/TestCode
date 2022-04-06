package CarSpeed;

public class JapanCarSpeed implements InterfaceCarSpeed{
	
	private static final int MAX_SPEED = 100;
	
    @Override
    public int speed(int speed) {
        return Math.min(MAX_SPEED, speed);
    }

	public static void main(String[] args) {
		
		JapanCarSpeed japanCarSpeed = new JapanCarSpeed();
		japanCarSpeed.speed(MAX_SPEED);
		System.out.println(japanCarSpeed.speed(MAX_SPEED));

	}

	public static int getMaxSpeed() {
		return MAX_SPEED;
	}

}
