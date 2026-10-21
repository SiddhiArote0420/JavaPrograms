/*Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
                       PerHeight < 150.0  : The person is Dwarf.                               	 
                    	PerHeight >= 150.0 && PerHeight < 165.0  :   The person is  average heighted.                               	
                    	 PerHeight >= 165.0 && PerHeight <= 195.0 :  The person is taller.
                    	Test Data : 135
                    	Expected Output :
                    	The person is Dwarf.*/
		
		
import java.util.*;
public class CatPersonAcToHight
{
   public static void main(String x[])
   {
     Scanner categorizePerson = new Scanner(System.in);

     System.out.println("Enter the Height :");
     int perHeight = categorizePerson.nextInt();

     if( perHeight < 150)
     {
       System.out.println("The person is Dwarf");
     }else if(perHeight >= 150 && perHeight < 165){
       System.out.println("The person is  average heighted");
     }else if(perHeight >= 165 && perHeight <= 195){
       System.out.println("The person is taller");
     }else{
       System.out.println("Input is Invalid");
     }

   }
}   