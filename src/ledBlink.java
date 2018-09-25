
/**
 *
 * @author Kuu
 */
import java.util.Scanner;

public class ledBlink {

    public static int outPin = 0;
    public static Runtime runTime = Runtime.getRuntime();

    static String[][] morseKey = {
        {" ", "\n"}, {"A", "*- "}, {"B", "-*** "}, {"C", "-*-* "}, {"D", "-** "},
        {"E", "* "}, {"F", "**-* "}, {"G", "--* "}, {"H", "**** "},
        {"I", "** "}, {"J", "*--- "}, {"K", "-*- "}, {"L", "*-** "}, {"M", "-- "},
        {"N", "-* "}, {"O", "--- "}, {"P", "*--* "}, {"Q", "--*- "},
        {"R", "*-* "}, {"S", "*** "}, {"T", "- "}, {"U", "**- "},
        {"V", "***- "}, {"W", "*-- "}, {"X", "-**- "}, {"Y", "-*-- "},
        {"Z", "--** "}, {"1", "*---- "}, {"2", "**--- "}, {"3", "***-- "},
        {"4", "****- "}, {"5", "***** "}, {"6", "-**** "}, {"7", "--*** "},
        {"8", "---** "}, {"9", "----* "}, {"0", "----- "},
        {".", "*-*-*- "}, {"\"", "*-**-* "}, {",", "--**-- "},
        {"?", "**--** "}, {"(", "-*--*- "}, {")", "-*--*- "},
        {"'", "*----* "}, {"!", "-*-*-- "}, {"/", "-**-* "}
    };

    public static String EngToMorse(String message) {

        for (int i = 0; i < morseKey.length; i++) {
            message = message.replace(morseKey[i][0], morseKey[i][1]);
        }

        System.out.println(message);
        return (message);

    }

    public static void main(String args[]) {
	String msg;
        System.out.println("Press CTRL-C to exit");
	
	try {
            runTime.exec("gpio mode " + outPin + " out");
	    
	    while(true) {
	
	        System.out.println("Please input your message:");
	        Scanner scanner = new Scanner(System.in);
	        msg = scanner.nextLine().toUpperCase();
	        System.out.println("Message to convert: \"" + msg + "\"\n");
	        	    
		
		for(char i : EngToMorse(msg).toCharArray()){
		    if( i == '*') {
			dot();
		    } else if( i == '-') {
			dash();
		    } else {
			Thread.sleep(500);
		    }
		}
	    }

	} catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }

    public static void dot() {
	try {
            runTime.exec("gpio write " + outPin + " 1");
            Thread.sleep(100);
            runTime.exec("gpio write " + outPin + " 0");
            Thread.sleep(150);
	
	} catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }

    public static void dash() {
        try {
	    runTime.exec("gpio write " + outPin + " 1");
            Thread.sleep(350);
            runTime.exec("gpio write " + outPin + " 0");
            Thread.sleep(150);
	} catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
}
