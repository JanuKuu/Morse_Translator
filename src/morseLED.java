
/**
 *
 * @author Kuu
 */

public class MorseLED {
	
	public void dot() {
		try {
			runTime.exec("gpio write " + outPin + " 1");
			Thread.sleep(100);
			runTime.exec("gpio write " + outPin + " 0");
			Thread.sleep(150);
	
		} catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
	}
	public void dash() {
		try {
			runTime.exec("gpio write " + outPin + " 1");
			Thread.sleep(350);
			runTime.exec("gpio write " + outPin + " 0");
			Thread.sleep(150);
		} catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
	}
	public void sleep() {
		Thread.sleep(500);
	}
}