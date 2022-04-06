package CarSpeed;

import CarSpeed.KoreaCarSpeed;
import CarSpeed.ChinaCarSpeed;
import CarSpeed.JapanCarSpeed;

public class Car {
	
	private final InterfaceCarSpeed carSpeed;

    public Car(final InterfaceCarSpeed interfaceCarSpeed) {
        this.carSpeed = interfaceCarSpeed;
    }

    public int movedCarSpeed(int speed) {
        return carSpeed.speed(speed);
    }
    
	public static void main(String[] args) {
		
		KoreaCarSpeed kc = new KoreaCarSpeed();
		System.out.println(kc.getMaxSpeed());
	    
		ChinaCarSpeed cc = new ChinaCarSpeed();
		System.out.println(cc.getMaxSpeed());
	    
		JapanCarSpeed jc = new JapanCarSpeed();
		System.out.println(jc.getMaxSpeed());

	}
}