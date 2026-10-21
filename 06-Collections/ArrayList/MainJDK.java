

import java.util.*;

public class MainJDK{

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(30, 10, 40, 20);

        list.stream()
            .sorted()
            .forEach(System.out::println);
    }
} 