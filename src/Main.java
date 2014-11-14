import lejos.nxt.LCD;
import lejos.nxt.LCDOutputStream;
import lejos.nxt.Motor;


public class Main {
	public static void main(String[] args) {
		
		LCD.drawString("Test!!!", 0, 0);

		
		Motor.A.forward();
		try {
			Thread.sleep(10000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
