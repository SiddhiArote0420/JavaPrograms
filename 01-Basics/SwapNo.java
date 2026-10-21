//Write a java program swap two number using third variable.

public class SwapNo
{
  public static void main(String x[])
  {
   int a=Integer.parseInt(x[0]);
   int b=Integer.parseInt(x[1]);
   int temp;
  
   temp=a;
   a=b;
   b=temp; 
  
   System.out.printf("a=%d\n b=%d\n",a,b);
  }
}
     