package colle;

import java.util.ArrayList;
import java.util.Iterator;

public class AryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("rama");
al.add("krishna");
al.add("zara");
al.add("hari");
al.add("kishore");
System.out.println(al);
al.add("zara");
System.out.println(al);
System.out.println(al.get(1));
System.out.println(al.get(5));
System.out.println(al.remove(3));
System.out.println(al);
Iterator<String> i=al.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}

	}

}
