package com.nr.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import com.nr.entity.Product;

public class TestApp {
	
	public static void main(String[] args) {
		
		ArrayList<Product> pl=new ArrayList<Product>();
		pl.add(new Product(101,"foundation",500));
		pl.add(new Product(102,"compact",120));
		pl.add(new Product(103,"lipstick",250));
		pl.add(new Product(104,"primer",150));

        List<Product> newpl=pl.stream().filter(p -> p.getPrice() > 150).collect(Collectors.toList());
		newpl.forEach(System.out::println);
		
		Optional<Product> pro=pl.stream().max((e1,e2)->e1.getPrice()>e2.getPrice()?1:-1);
		
		if(pro.isPresent())
		{
			System.out.println(pro);
		}
		
		Product op=pl.stream().max(Comparator.comparing(Product::getPrice)).get();
		System.out.println(op);
		
		
		HashMap<Integer,String> hmp=new HashMap<Integer,String>();
		hmp.put(109, "Berry");
		hmp.put(102, "Apple");
		hmp.put(107, "Banana");
		
		List li=new LinkedList(hmp.entrySet());
		
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			Map.Entry en=(Entry) itr.next();
			System.out.println(en.getKey()+"    "+en.getValue());
		}
		
	}

}
