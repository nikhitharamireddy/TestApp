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

public class TestCollections {
	
public static void main(String[] args) {
	HashMap mp=new HashMap<Integer,String>();
	mp.put(23, "Aohn");
	mp.put(33,"Miriam");
	mp.put(11,"Jack");
	mp.put(49,"Benefer");
	
	/*Set se=mp.keySet();
	Iterator itr=se.iterator();
	while(itr.hasNext())
	{
		Integer ie=(Integer) itr.next();
		System.out.println(ie+"     "+mp.get(ie));
	}*/
	
	/*Map sortmap=new TreeMap(mp);
	Set set=sortmap.keySet();
	Iterator itr=set.iterator();
	while(itr.hasNext())
	{
		Integer key=(Integer) itr.next();
		System.out.println(key+"....."+sortmap.get(key));
		
	}*/
	
	HashMap sortedmap=sortHashMapValues(mp);
	Set<Map.Entry<Integer, String>> s=sortedmap.entrySet();
	for(Map.Entry sr: s)
	{
		System.out.println(sr.getKey()+"........"+sr.getValue());
	}
	
	
	
	
	
	
}	

public static HashMap<Integer,String> sortHashMapValues(HashMap mp)
{
	List list=new LinkedList<Map.Entry<Integer, String>>(mp.entrySet());
    Collections.sort(list,new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo((Comparable)((Map.Entry)(o2)).getValue());
		}});
    
    HashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
    Iterator itr=list.iterator();
    
    while(itr.hasNext())
    {
    	Map.Entry<Integer,String> mitr=(Entry<Integer, String>) itr.next();
    	map.put(mitr.getKey(),mitr.getValue());
    }
    return map;
}
	

}
