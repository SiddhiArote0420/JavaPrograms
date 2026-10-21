public class Pattern3{
public static void main(String x[])
{ 
 
 char mid1= 'A';
 int mid2=1;

for (int i = 1 ; i <= 5 ;i++)
{
  char ch= 'A';
  int n = 1 ;
  
  for(int j = 1 ; j <= 9 ;j++)
   {
      if(j >= (11 - (2*i)))
      {
         if(i%2 != 0 )
         {
   		   if(ch < mid1)
		   {
		     System.out.print(ch +" ");
			 ch++;
			}else{
		     System.out.print(ch +" ");
			 ch--;
			}
		  }else
		  {
             if (n < mid2)
              {
    			  System.out.print(n+" ");
				  n++;
              }else{
			    System.out.print(n+" ");
				n--;
			  }
           }
		}else{
			System.out.print("  ");
		}
	}
	System.out.println();
	mid1++;
	mid2++;
 }
}
}