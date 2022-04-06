package CarSpeed;

public class ChinaCarSpeed implements InterfaceCarSpeed{
	
	private static final int MAX_SPEED = 140;
	
    @Override
    public int speed(int speed) {
        return MAX_SPEED;
    }

	public static void main(String[] args) {
	    
	    ChinaCarSpeed chinaCarSpeed = new ChinaCarSpeed();
		chinaCarSpeed.speed(MAX_SPEED);
		System.out.println(chinaCarSpeed.speed(MAX_SPEED));

	}

	public static int getMaxSpeed() {
		return MAX_SPEED;
	}

}
