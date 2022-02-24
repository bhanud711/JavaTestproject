package com.test;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> ts=new TreeSet<String>();
ts.add("rama");
ts.add("krishna");
ts.add("hari");
ts.add("murali");
System.out.println(ts);
ts.add("rama");
ts.add("krishna");
System.out.println(ts);
Iterator<String> it = ts.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
