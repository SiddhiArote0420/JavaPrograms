import java.util.*;
public class Freqvency{
public static void main(String[] args){
 
  Scanner sc = new Scanner(System.in);
  
 System.out.println("Enter the string");
 String s = sc.nextLine();

 char ch[] = s.toCharArray();
 Map<Character,Integer> map = new LinkedHashMap<>();

  for(int i=0;i<ch.length;i++){
     map.put(ch[i], map.getOrDefault(ch[i],0)+1);
  }
 System.out.println(map);
 }
}