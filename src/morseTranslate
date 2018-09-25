
/**
 *
 * @author Kuu
 */
import java.util.Scanner;

public class ledBlink {

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

        return (message);

    }

    public static void main(String args[]) {
	String msg;
        System.out.println("Press CTRL-C to exit");
	
	try {
	    
	    while(true) {
	
	        System.out.println("Please input your message:");
	        Scanner scanner = new Scanner(System.in);
	        msg = scanner.nextLine().toUpperCase();
	        System.out.println("Message to convert: \"" + msg + "\"\n");
		
		EngToMorse(msg).toCharArray();
		
	    }

	} catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }

}
