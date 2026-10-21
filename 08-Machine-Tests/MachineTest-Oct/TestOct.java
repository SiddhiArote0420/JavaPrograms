/*
1
2*2
3*3*3
4*4*4*4
3*3*3
2*2
1
*/

import java.util.*;
public class TestOct {
    public static void main(String[] x) {
        int n = 3;

        for (int i = 1; i <= 7; i++) {
			boolean flag = false;
            for (int j = 1; j <= 7; j++) {
           
                if ((i <= 4 && (i+i-1)>=j) || (i>4 && 15 -(i*2)>=j)){
                
                if (!flag) {
                    if (i <= 4){
                        System.out.print(i);
                    }else{
                        System.out.print(n);
					}
					flag = true;
                }else{
					System.out.print("*");
                    flag = false; 
                   
                  }
				}
				
            }

            if (i > 4)
				n--;
                

            System.out.println();
        }
    }
}
