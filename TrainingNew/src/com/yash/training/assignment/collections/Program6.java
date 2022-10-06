package com.yash.training.assignment.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * WAP to store data in hashmap. Keys are the city name and values are the population.
   Now you have to sort the all elements (on the basis of city name ) in hashmap and
   print the detail.
 * @author shubham.yadav
 *
 */

public class Program6 {

	public static void main(String[] args) {
		
		HashMap<String, String> cityPopulationMap = new HashMap<String, String>();
		
		cityPopulationMap.put("Indore", "700 lakh");
		cityPopulationMap.put("Dewas", "20 lakh");
		cityPopulationMap.put("Ujjain", "15 lakh");
		cityPopulationMap.put("Guna", "60 lakh");
		cityPopulationMap.put("Bhopal", "30 lakh");
		
		System.out.println("Original map is - " + cityPopulationMap);
		Map<String, String> treeMap = new TreeMap<>();
		   
        // Convert the HashMap to TreeMap manually
        for (Map.Entry<String, String> e : cityPopulationMap.entrySet()) {
            treeMap.put(e.getKey(), e.getValue());
        }
        
         System.out.println("Sorted Hashmap is - " + treeMap);
		

	}

}
