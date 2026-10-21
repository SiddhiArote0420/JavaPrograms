import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Collection<List<String>> result =
                Arrays.stream(arr)
                      .collect(Collectors.groupingBy(str -> {
                          char[] ch = str.toCharArray();
                          Arrays.sort(ch);
                          return new String(ch);
                      }))
                      .values();

        result.forEach(System.out::println);
    }
}