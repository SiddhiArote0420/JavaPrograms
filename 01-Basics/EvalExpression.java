//evaluate expressions using compound assingment operator(+=,-=,...etc)

public class EvalExpression
{
  public static void main( String x[])
  {
	  double a = Double.parseDouble(x[0]);
	  double b = Double.parseDouble(x[1]);
	  
	  
	   b *= a-13;
	  
	  System.out.printf("Expression  ="+b);
  }
}
	  