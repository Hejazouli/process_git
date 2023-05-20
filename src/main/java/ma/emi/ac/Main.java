package ma.emi.ac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream() .filter(x -> x.isEmpty()) .count();
        List<String> filtered = strList.stream() .filter(x -> !x.isEmpty()) .collect(Collectors.toList());
        System.out.println(count);
        System.out.println(filtered);
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries = G7.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining(", "));
        System.out.println(G7Countries);
    }
}