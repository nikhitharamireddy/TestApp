package com.nr.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.nr.entity.Product;

public class CollectStreams {
	public static void main(String[] args) {
		HashMap<Integer,Product> hmp=new HashMap<Integer,Product>();
		hmp.put(101, new Product(1,"Flour",250));
		hmp.put(102, new Product(2,"Wheat",120));
		hmp.put(103, new Product(3,"Maida",240));
		hmp.put(104, new Product(4,"Spices",180));
		
		List li=new LinkedList(hmp.entrySet());	
		Collections.sort(li,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				/*float a1=(((Product)(((Map.Entry)(o1)).getValue())).getPrice());
				float a2=(((Product)(((Map.Entry)(o2)).getValue())).getPrice());
			

				if(Float.compare(a1,a2)>1)
				{
					return 1;
				}
				else
					return -1;*/
				int a1=(((Product)(((Map.Entry)(o1)).getValue())).getPrice());
				int a2=(((Product)(((Map.Entry)(o2)).getValue())).getPrice());
				if(a1>a2)
				{
					return 1;
				}
				else return -1;
				
			}});
		
		HashMap<Integer,Product> sort=new LinkedHashMap<Integer,Product>();
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			Map.Entry mpt=(Entry) itr.next();
			sort.put((Integer)mpt.getKey(),(Product) mpt.getValue());
			
		}
		Set<Map.Entry<Integer, Product>> set=sort.entrySet();
		for(Map.Entry sor: set)
		{
			System.out.println(sor.getKey()+"   "+sor.getValue());
		}
	}

}
