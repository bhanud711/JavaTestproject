package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("rama");
al.add("krishna");
al.add("ganesh");
al.add("hari");
System.out.println(al);
al.add("rama");
System.out.println(al);
System.out.println(al.get(1));
al.add("rama");
al.add("krishna");
al.add("ganesh");
al.add("hari");
al.add("rama");
al.add("krishna");
al.add("ganesh");
al.add("hari");
al.add("rama");
al.add("krishna");
al.add("ganesh");
al.add("hari");
al.add("rama");
al.add("krishna");
al.add("ganesh");
al.add("hari");
al.add("rama");
al.add("krishna");
al.add("ganesh");
al.add("hari");
Iterator<String> it = al.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

	}

}
