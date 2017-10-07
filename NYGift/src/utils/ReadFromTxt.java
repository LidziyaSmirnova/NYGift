package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import exceptions.IncorrectSweetsException;
import sweets.Biscuits;
import sweets.Candy;
import sweets.Sweets;
import sweets.Zephyr;

public class ReadFromTxt {
	
	private static final String CANDY = "Candy";
	private static final String BISCUITS = "Biscuits";
	private static final String ZEPHYR = "Zephyr";

	public static List<String[]> readFile(String fileName) {
		System.out.println("\nNY Gift from txt file:");
		List<String[]> giftArray = new ArrayList<String[]>();
		try {
			FileReader reader = new FileReader("E:/java/Input.txt");
			BufferedReader in = new BufferedReader(reader);
			String string;
			while ((string = in.readLine()) != null) {
				giftArray.add(string.split(","));
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return giftArray;
	}

public static List<Sweets> createGiftFromStringArray(List<String[]> giftArray) throws IncorrectSweetsException {
	List<Sweets> gift = new ArrayList<Sweets>();
	for(String[] giftString:giftArray) {
	switch(giftString[0]) {
	case CANDY:
		gift.add (new Candy(giftString[1],Double.parseDouble(giftString[2]),Double.parseDouble(giftString[3]),giftString[4],giftString[5]));
		break;
	case BISCUITS:
		gift.add (new Biscuits(giftString[1],Double.parseDouble(giftString[2]),Double.parseDouble(giftString[3]),Integer.parseInt(giftString[4])));
		break;
	case ZEPHYR:
		gift.add (new Zephyr(giftString[1],Double.parseDouble(giftString[2]),Double.parseDouble(giftString[3]),giftString[4],Integer.parseInt(giftString[5])));
		break;
		default: throw new IncorrectSweetsException();}
	}
	return gift;
	}
    

public static void printSweets (List<Sweets> giftlist) {
	for (Sweets sweet : giftlist) {
		sweet.print();
	}
}
}