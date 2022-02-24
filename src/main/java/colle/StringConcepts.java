package colle;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="apple";
String name1="BANANA";
String name2="apple";
String name3="Orange";
String name4="APPLE";
String name5=new String("rama");
String name6=new String("rama");
System.out.println(name.length());  //5
System.out.println(name1.length()); //6
System.out.println(name.toUpperCase());
System.out.println(name1.toLowerCase());
System.out.println(name.equals(name2));
System.out.println(name.equals(name3));
System.out.println(name.concat(name3));
System.out.println(name.charAt(2));
System.out.println(name.contains("l"));
System.out.println(name.endsWith("e"));
System.out.println(name.equalsIgnoreCase(name4));
System.out.println(name.isEmpty());
System.out.println(name.replace("p", "r"));
System.out.println(name5.equals(name6));
System.out.println(name5==name6);
	}

}
