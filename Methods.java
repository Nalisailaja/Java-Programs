import java.util.Scanner;
public class Methods {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 NUmbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
	int res1=add(num1,num2);
	System.out.println("Addition Result : "+res1);
	
	int res2=sub(num2,num1);
	System.out.println("Subtraction Result : "+res2);
	
	int res3=mul(num1,num2);
	System.out.println("Multiplication Result "+res3);
	
	int res4=div(num2,num1);
	System.out.println("Division Result : "+res4);
int res5=mod(num2,num1);
	System.out.println("Remainder is : "+res5);
	
int res6=add(num1,num2)/2;
System.out.println("Avg of 2 numbers is : "+res6);
	}
	public static int add(int x,int y)
	{
		int z=x+y;
		return z;
	}
	
	public static int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public static int mul(int m,int n)
	{
		int p=m*n;
		return p;
	}
	public static int div(int i,int j)
	{
		int k=i/j;
		return k;
	}
	public static int mod(int num1,int num2)
	{
		int num3=num1%num2;
		return num3;
	}
}