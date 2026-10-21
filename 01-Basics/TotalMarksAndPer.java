//Write a java program to enter marks of five subjects and calculate total marks and percentage.

public class TotalMarksAndPer
{
  public static void main(String x[])
  {
   int sub1 = Integer.parseInt(x[0]);
   int sub2 = Integer.parseInt(x[1]);
   int sub3 = Integer.parseInt(x[2]);
   int sub4 = Integer.parseInt(x[3]);
   int sub5 = Integer.parseInt(x[4]);
   
   double totalMarks= sub1+sub2+sub3+sub4+sub5;
   double percentage = (totalMarks/500)*100;
   
   
   System.out.println("Total Marks is :%f\n"+totalMarks);
   System.out.println(" Percentage is :%f\n"+percentage);
   
   }
  }
  