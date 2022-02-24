package colle;

import java.util.Arrays;

public class MorningAry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,56,67};
System.out.println("Array Length is : "+a.length);
for(int i=0;i<a.length;i++)  //i=6;6<6
{
	System.out.println(a[i]); // a[5]
}

int b[]= {45,65,5,25,15,75,95};
Arrays.sort(b);
System.out.println("length of B array"+b.length);
for(int i=0;i<b.length;i++)
{
	System.out.print(b[i]+" ");
}


	}

}
