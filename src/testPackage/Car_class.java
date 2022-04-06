package testPackage;

public class Car_class {
	
	private static final int KOREA_LIMIT_SPEED = 120;
	
    public int movedCarSpeed(int speed) {
        return Math.min(KOREA_LIMIT_SPEED, speed);
    }
    
    public static void main(String[] args) {
    
    Car_class cs = new Car_class();
    int c = Car_class.KOREA_LIMIT_SPEED;
    
    System.out.println(c);
    
    }
}