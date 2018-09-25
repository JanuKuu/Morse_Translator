
/**
 *
 * @author Kuu
 */

public class ledBlink {

	MorseLED led = new MorseLED();
	
	static int outPin = 0;
	static Runtime runTime = Runtime.getRuntime();

	public static void main(String args[]) {
		String msg;
		System.out.println("Press CTRL-C to exit");
		
		try {
			
			runTime.exec("gpio mode " + outPin + " out");
			
			while(true) {
				
				msg = TranslateMsg();

				for(char i : msg.toCharArray()){
					if(i == '*') {
						dot();
					} else if(i == '-') {
						dash();
					} else {
						sleep();
					}
				}
			}
		
		} catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
	}


}
