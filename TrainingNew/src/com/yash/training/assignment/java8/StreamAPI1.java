package com.yash.training.assignment.java8;

import java.nio.file.DirectoryStream.Filter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Item {

	int itemid;
	String iname;
	LocalDateTime date_of_manufacturing;
	LocalDateTime date_of_expiry;
	float price;
	
	
	public Item(int itemid, String iname, LocalDateTime date_of_manufacturing, LocalDateTime date_of_expiry,
			float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
		this.price = price;
	}
	
	
}

public class StreamAPI1 {

	public static void main(String[] args) {
		
		ArrayList<Item> itemList = new ArrayList<Item>();
		
		Item item1 = new Item(1,"oil",LocalDateTime.now(),LocalDateTime.now(),100);
		itemList.add(item1);
		Item item2 = new Item(2,"sugar",LocalDateTime.now(),LocalDateTime.now(),90);
		itemList.add(item2);
		Item item3 = new Item(3,"rice",LocalDateTime.now(),LocalDateTime.now(),50);
		itemList.add(item3);
		Item item4 = new Item(4,"water bottle",LocalDateTime.now(),null,150);
		itemList.add(item4);
		Item item5 = new Item(5,"dresses",LocalDateTime.now(),null,120);
		itemList.add(item5);
		
		int itemListSize = itemList.size();
		//a
		
		DoubleSummaryStatistics stats = itemList.stream().mapToDouble(s->s.price).summaryStatistics();
		
		System.out.println("Average id - " + stats.getAverage());
		
		//b
		System.out.println("Min Price- " + stats.getMin() + " and Max Price- " + stats.getMax());
		
		double maxPrice = stats.getMax();
		
		//c
		//List<> cAns = itemList.stream().filter().collect(Collectors.toList()); 
		
		
		HashSet<String> setName = (HashSet<String>) itemList.stream().map(s->s.iname).collect(Collectors.toSet());
		System.out.println(setName);
		HashSet<Float>  setFloat = (HashSet<Float>) itemList.stream().map(s-> s.price).collect(Collectors.toSet());
		
		//e
		System.out.println(setFloat);
		
		
		
	}

}
