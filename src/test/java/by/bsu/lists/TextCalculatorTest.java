package by.bsu.lists;

import by.bsu.list.TextCalculator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextCalculatorTest {

    @Test
    public void testFindWordsThatHasA(){
        List<String> input = Arrays.asList("Ajjh","dsfds","hgjA");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatHasA(input);
        System.out.println(result);
    }
    @Test
    public void testNotFindWordsThatHasA(){
        List<String> input = Arrays.asList("jjh","dsfds","hgj");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatHasA(input);
        System.out.println(result);
    }

    @Test
    public void testfindWordsThatStartsWithCapital(){
        List<String> input = Arrays.asList("Ajjh","dsfds","Agj");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatStartsWithCapital(input);
        System.out.println(result);
    }

    @Test
    public void testNotfindWordsThatStartsWithCapital(){
        List<String> input = Arrays.asList("ajjh","dsfds","llgj");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatStartsWithCapital(input);
        System.out.println(result);
    }

    @Test
    public void testfindNumbersThatGreaterThanX() {
        List<Integer> input = Arrays.asList(34,77,9);
        int a = 34;

        TextCalculator calculator = new TextCalculator();
        List<Integer> result = calculator.findNumbersThatGreaterThanX(input,a);
        System.out.println(result);
    }

    @Test
    public void testNotfindNumbersThatGreaterThanX() {
        List<Integer> input = Arrays.asList(34,77,9);
        int a = 34000;

        TextCalculator calculator = new TextCalculator();
        List<Integer> result = calculator.findNumbersThatGreaterThanX(input,a);
        System.out.println(result);
    }
}
