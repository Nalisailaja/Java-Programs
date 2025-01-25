import java.io.*;
import java.util.*;
class Arithmetic{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int result=0;

System.out.println("Result:"+(a+b));
System.out.println("Result:"+(b-a));
System.out.println("Result:"+(b*c));
System.out.println("Result:"+(b/d));
System.out.println("Result:"+(a%d));
}
}