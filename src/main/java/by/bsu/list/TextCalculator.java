package by.bsu.list;

import java.util.List;
import java.util.stream.Collectors;

public class TextCalculator {

    public List<String> findWordsThatHasA(List<String> text){
        return text.stream().filter(x -> x.contains("A")).collect(Collectors.toList());
      }

    public List<String> findWordsThatStartsWithCapital(List<String> text){

        return text.stream().filter(x -> x.matches("^[A-Z][A-z0-9]*$")).collect(Collectors.toList());
      }

    public List<Integer> findNumbersThatGreaterThanX(List<Integer> numbers,int x) {

        return numbers.stream().filter(j -> j > x).collect(Collectors.toList());
    }
}
