/*
10. Student Marks Entry**

**Description:**

* Keep asking for student marks in a do-while loop.
* If marks are negative, **continue** to skip and ask again.
* If "stop" is entered, **break**.
* Finally, display average marks of valid entries.
*/

import java.util.*;
public class StudentMarks_Entry
{   private static final String STOP = "stop";
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		//int sub1,sub2,sub3,sub4;
		String input;int subMarks = 1,total =0,count =0 ;
		do{
			System.out.println("if you doesn't want to enter marks Write stop :");
			input = sc.nextLine();
			
			if(input.equalsIgnoreCase(STOP))
				break;
			
			subMarks = Integer.parseInt(input);
			if( subMarks >= 0 )
			{
				count++;
				total = total +subMarks;
			}else{
				continue;
			}
		}while(true);
		
		int avg = total / count;
		System.out.println("Avarage marks is : "+ avg);
	   
	}
}
			
			/*System.out.println("Enter your 4 subject Marks");
			sub1 = sc.nextInt();
			sub2 = sc.nextInt();
			sub3 = sc.nextInt();
			sub4 = sc.nextInt();
			 if(sub1 < 0 || sub2 < 0 || sub3 < 0 || sub4 < 0)
			 {
				 System.out.println("Envalid Input. (Enter valid input)");
				 continue;
			 }else{
				 System.out.println("Avarage marks is : "+ (sub1+sub2+sub3+sub4)/4);
				 break;
			 }
		}while(true);
	}
}*/
				 