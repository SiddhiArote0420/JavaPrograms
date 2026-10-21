//Write program to input number and check number is Armstrong or not?


import java.util.*;
public class ArmstrongNo{
public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter the number");
 int num = sc.nextInt();
  
  int temp=num,count=0;
  while(temp!=0)
  {
	  temp = temp/10;
	  count++;
  }
  
  temp = num;
  int sum =0;
  while(temp!=0)
  {
	  int a = temp%10;
	  temp = temp/10;
	  int pow =1;
	  for(int i=1; i<=count;i++)
	  {
		  pow = pow*a;
	  }
	  sum = sum+pow;
  }
  if(sum == num)
  {
	  System.out.println("Number is a Armstrong");
  }else{
	  System.out.println("Number is not Armstrong");
  }
 }
}

	  