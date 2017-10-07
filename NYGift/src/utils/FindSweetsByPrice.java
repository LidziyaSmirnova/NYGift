package utils;

import java.util.List;

import exceptions.SweetsNotFoundException;
import sweets.Sweets;

public class FindSweetsByPrice {
	
	public static Sweets findSweetsbyPrice (double PriceFind, List<Sweets> nygift)throws SweetsNotFoundException {
		for (Sweets s : nygift) {
        if (PriceFind == s.getPrice()) {
        	System.out.println("\nSweets with this price: "+s.getName());
        	return s;
        }
		}
		throw new SweetsNotFoundException();
		
	}  
}

