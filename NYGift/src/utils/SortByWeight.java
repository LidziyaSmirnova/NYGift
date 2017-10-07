package utils;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

import sweets.Sweets;

public class SortByWeight implements Comparator <Sweets> {
	public int compare(Sweets s1, Sweets s2) { 
		if(s1.getWeight()>s2.getWeight()) {
			return 1;
		}
		else if(s1.getWeight()<s2.getWeight()) {
			return -1;
		}
			return 0;}	
	
public static List<Sweets> sortByWeight(List<Sweets> nygift) {
	System.out.println("\nWhich includes:");
	Collections.sort(nygift, new SortByWeight());
	for (Sweets sw : nygift) {
		System.out.println(sw.getName()+": "+sw.getWeight());
	}
	return nygift;
	
}
}