package com.isa;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> ts=new TreeSet<String>();
ts.add("ismail");
ts.add("gopi");
ts.add("rama");
System.out.println(ts);
ts.add("rama");
ts.add("ismail");
System.out.println(ts);
Iterator<String> it = ts.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
