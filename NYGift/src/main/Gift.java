package main;

import sweets.Sweets;
import sweets.Biscuits;
import sweets.Candy;
import sweets.Zephyr;
import utils.DOMXmlParser;
import utils.FindSweetsByPrice;
import utils.GiftWeight;
import utils.IGift;
import utils.ReadFromDB;
import utils.ReadFromTxt;
import utils.SortByWeight;
import utils.ToTxt;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exceptions.IncorrectSweetsException;
import exceptions.SweetsNotFoundException;

public class Gift {

	public static void main(String[] args) throws SQLException {

		List<Sweets> nygift = new ArrayList<Sweets>();

		createGift(nygift);

		//ToTxt.redirectOutput();

		GiftWeight.giftWeight(nygift);

		SortByWeight.sortByWeight(nygift);

		try {
			FindSweetsByPrice.findSweetsbyPrice(11.7, nygift);
		} catch (SweetsNotFoundException e) {
			System.err.println("Sweets with this price are not found");
		}
		
		try {
			FindSweetsByPrice.findSweetsbyPrice(30, nygift);
		} catch (SweetsNotFoundException e) {
			System.err.println("Sweets with this price are not found");
		}

		try {
		ReadFromTxt.printSweets(ReadFromTxt.createGiftFromStringArray(ReadFromTxt.readFile("E:/java/Input.txt")));
		} catch (IncorrectSweetsException e) {
			System.err.println("Txt file contains incorrect sweets type");
		}
		
		IGift xml = new DOMXmlParser("E:/java/Gifts.xml");
		xml.getSweets();

		IGift db = new ReadFromDB();
		db.getSweets();
	}

private static void createGift(List<Sweets> nygift) {
nygift.add(new Candy("Аленка", 200, 26, "Шоколадная конфета", "Коммунарка"));
nygift.add(new Biscuits("К чаю", 300, 11.7, 10));
nygift.add(new Zephyr("Грибочки", 150, 22.8, "Зефир в шоколаде", 6));
		}

}
