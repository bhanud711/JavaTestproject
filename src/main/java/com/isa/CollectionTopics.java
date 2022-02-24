package com.isa;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("rama");
al.add("krishna");
al.add("ismail");
al.add("shinwari");
al.add("gopi");
System.out.println(al);
al.add("rama");
al.add("ismail");
System.out.println(al);
System.out.println(al.get(3));
Iterator<String> it = al.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
		
	}

}
