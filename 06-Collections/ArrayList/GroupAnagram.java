import java.util.*;

public class GroupAnagram {

    static boolean isAnagram(String s1,String s2){

        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }

    public static void main(String[] args){

        String[] arr={"eat","tea","tan","ate","nat","bat"};

        boolean[] visited=new boolean[arr.length];

        for(int i=0;i<arr.length;i++){

            if(visited[i])
                continue;

            System.out.print("[");

            System.out.print(arr[i]);

            visited[i]=true;

            for(int j=i+1;j<arr.length;j++){

                if(!visited[j] && isAnagram(arr[i],arr[j])){

                    System.out.print(","+arr[j]);

                    visited[j]=true;

                }

            }

            System.out.println("]");
        }

    }
}