/* .Write a menu-driven program using switch and do-while to perform operations on a single character:
Check if the character is an alphabet.
If alphabet, check vowel or consonant.
If digit, check even or odd.
Convert uppercase to lowercase or vice versa.
Exit the program
*/

import java.util.*;
public class OperatnsOn_character
{    private static final String EXIT = "exit";
	public static void main(String x[ ])
	{
		Scanner sc = new Scanner(System.in);
		
		char ch,ch1;
		do{
		    System.out.println("Enter Character");
			ch = sc.next().charAt(0);
			
			System.out.println("......MENU......");
			System.out.println("1.Check if the character is an alphabet.");
			System.out.println("2. If alphabet, check vowel or consonant.");
			System.out.println("3. If digit, check even or odd.");
			System.out.println("4. Convert uppercase to lowercase or vice versa.");
		    System.out.println("5. Exit");
			
			System.out.println("Enter which operation you want to perform");
			int choice = sc.nextInt();
			
			int a;
			switch(choice)
			{
				case 1 :
				     if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z'))
					 {
                        System.out.println("Characer is a alphabet");
					 }else{
                        System.out.println("It is Not a alphabet");
					 }
                    break;

                case 2 :
                    	if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z'))
					 {
						if(ch == 'A' || ch =='E' ||ch =='I' ||ch == 'O' || ch == 'U'||ch == 'a' || ch =='e' ||ch =='i' ||ch == 'o' || ch == 'u')
						{
                            System.out.println("It is Vowel");
						}else{
							System.out.println("It is Consonant");
						}
					 }else{
                        System.out.println("It is Not a alphabet");
					 }			
					 break;
					 
				case 3 :
				  
				     if(ch >= '0' && ch <= '9')
					 {  
				        int num = ch - '0';  
						if(num%2==0){ 
                        System.out.println("It is a even number");
						}else{
							System.out.println("It is a odd number");
						}
					 }else{
                        System.out.println("It is Not a digit");
					 }
					 break;
				
                case 4:
                    if(ch >= 65 && ch <= 90)
					{
                         System.out.println((char)(ch+32));
					}else{
                         System.out.println((char)(ch-32));						
					}
                    break;	
 
                case 5:	
                    System.out.println("You Are Exit");
                    break;
					
				default :
                    System.out.println("Invalid Input");
                    break; 
			}	 
			System.out.println("Do you want to Countinue(y/n)");
			ch1 = sc.next().charAt(0);
		}while(ch1 == 'y');
	}
}