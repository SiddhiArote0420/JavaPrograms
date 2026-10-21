//swap to numbers without using third veriable

public class swapWithoutThrdV
{
  public static void main(String x[])
  {
	  int a = Integer.parseInt(x[0]);
	  int b = Integer.parseInt(x[1]);
	  
	  a = a + b;
	  b = a - b;
	  a = a -b;
	  
	  System.out.printf("a=%d\n b=%d\n",a,b);
  }
}
	  