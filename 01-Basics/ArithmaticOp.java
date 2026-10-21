public class ArithmaticOp
{
   public static void main(String x[])
  {
   int a = Integer.parseInt(x[0]);
   int b = Integer.parseInt(x[1]);
   int add, sub, mul, div;
   add = a+b;
   sub = a-b;
   mul = a*b;
   div = a/b;
   
   System.out.printf( "Addition = %d\n Subtraction = %d\n Multiplication =%d\n Division =%d\n",add,sub,mul,div);
  }
}