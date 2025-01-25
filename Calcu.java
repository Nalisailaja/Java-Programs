import java.util.Scanner;
 class Calcu {
	public static void main(String[] args) {
	Add(10,20);
	Add(10,2,15);
	Subtract(50,40);
	Subtract(50,10,5);
      Multp(12,16);
      Div(20,10);
	}
	public static void Add(int a, int b)
	{
                 int c=a+b;
		System.out.println("Addition:"+c);
	}
	public static void Add(int x, int y,int z)
	{
                 int s=x+y+z;
		System.out.println("Addition"+s);
	}
	public static void Subtract(int m,int n)
	{
               int d=m-n;
		System.out.println("Subtraction:"+d);
	}
	public static void Subtract(int p,int q,int r)
	{
             int x=p-q-r;
		System.out.println("Subtraction:"+x);
	}
     public static void Multp(int n1, int n2)
	{
              int mul=n1*n2;
		System.out.println("Multiplication:"+mul);
	}
      public static void Div(int x1,int x2)
	{
              int z=x1/x2;
		System.out.println("Division:"+z);
	}	
	
}