package com.nr.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.nr.entity.Product;

public class StreamTest {
public static void main(String[] args) {
	List<Product> li = new ArrayList<Product>();
	li.add(new Product(100,"Oil",250));
	li.add(new Product(101,"Basin",120));
	li.add(new Product(102,"Onion",550));
	li.add(new Product(103,"Masala",230));

	//li.stream().filter(x -> x.getPrice()>250).forEach(System.out::println);
	
	//li.stream().map(x->x.getPname().chars().filter(ch -> ch == 'i').count()).forEach(System.out::println);
	
	/*Optional<Product> p=li.stream().max((e1,e2)->e1.getPrice()>e2.getPrice()?1:-1); 

	if(p.isPresent())
	{
		System.out.println(p);
	}*/
	
	/*Optional<Product> p=li.stream().max(Comparator.comparing(Product::getPrice));
	if(p.isPresent())
	{
		System.out.println(p);
	}*/
	
	//li.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).forEach(System.out::println);
	
	//li.stream().sorted((e1,e2)->e1.getPrice()<e2.getPrice()?1:-1).forEach(System.out::println);
	
	List<String> listr=li.stream().map(x-> new StringBuilder(x.getPname()).reverse().toString()).collect(Collectors.toList());
	listr.forEach(System.out::println);
}
}
