/*
Q1. WAP to create class name as Table with functions 
 void setValue():  this function is used for accept the number as input parameter 
 void showTable(): this function can display the table of numbers.
*/

import java.util.*;
class Table{
	int n;
    void setValue(int n){
		this.n=n;
	}
	
	void showTable(){
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+" X "+i+" = "+ n*i);
		}
	}

}

public class DisplayTable{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		Table t = new Table();
		t.setValue(n);
		t.showTable();
	}
}