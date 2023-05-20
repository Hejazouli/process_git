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
    }
}