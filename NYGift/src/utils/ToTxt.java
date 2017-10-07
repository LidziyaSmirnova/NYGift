package utils;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ToTxt {
	
	public static void redirectOutput() {
	 PrintStream ps = null;
	 System.out.println("Results are saved to Output.txt file");

	 try {
	 ps = new PrintStream(new FileOutputStream("E:/java/Output.txt"));
	 System.setErr(ps);
	 System.setOut(ps);
	 } catch (Exception e) {
	 System.err.println("Error in writing to file");
	 }
	 }
}
