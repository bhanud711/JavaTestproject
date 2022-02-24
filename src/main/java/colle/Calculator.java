package colle;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		int sumOfTwoValue = c.sum(100, 150);
		System.out.println(sumOfTwoValue);
		int mul = c.mul(10, 20);
		System.out.println(mul);
	}
public int sum(int a, int b)
{
	int c;
	c=a+b;
	return c;
}
public int mul(int a,int b)
{
	int d;
	d=a*b;
	return d;
}
}
