package utils;

import java.util.List;

import sweets.Sweets;

public class GiftWeight {
	
	public static void giftWeight(List<Sweets> nygift) {
		System.out.println("Gift weight:");
		int sum = 0;
		for (Sweets sw : nygift) {
		    sum += sw.getWeight();
		}
		System.out.println(sum+" gr");
	}
}
