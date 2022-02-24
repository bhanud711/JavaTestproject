package colle;

import java.util.ArrayList;
import java.util.Iterator;

public class LionTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("rama");
al.add("krishna");
al.add("mohan");
al.add("ranga");
System.out.println(al);
al.add("rama");
al.add("mohan");
System.out.println(al);
Iterator<String> it = al.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
System.out.println(al.get(0));
System.out.println(al.remove(1));
System.out.println(al);
	}

}
