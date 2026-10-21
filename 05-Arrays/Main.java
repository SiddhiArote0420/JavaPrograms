/*Input :
programming
 
Output :
r
g
m*/


import java.util.*;
public class Main{
public static void main(String args[]){
        String str = "Programming";

      char ch[] = str.toCharArray();
      ArrayList<Character> arr = new ArrayList<>();
      for(int i=0; i<ch.length;i++){
       
     for(int j=i+1; j<ch.length; j++){
          if( ch[j] == ch[i] && !isAvailable(arr, ch[j])){
               arr.add(ch[j]);
        }

       }
     }
      System.out.println(arr);
    
 }


 public static boolean isAvailable(ArrayList<Character> list, char ch ){
              for(int i=0; i< list.size(); i++){

                 if(list.get(i) == ch){
                     return true;
                }
           }
        return false;
 }
}