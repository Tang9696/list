package by.bsu.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Aff");
        list.add("jlh");
        list.add("asDfA");
        list.add("D");

        List<Integer> list1 = new ArrayList<>();
        list1.add(76);
        list1.add(7);
        list1.add(56);
        list1.add(26);
        list1.add(9);

        TextCalculator calculator = new TextCalculator();

        List<String> listA = calculator.findWordsThatHasA(list);
        System.out.println("Words That Has A:" + listA);

        List<String> listB = calculator.findWordsThatStartsWithCapital(list);
        System.out.println("Words That Starts With Capital:" + listB);

        Scanner x = new Scanner(System.in);
        System.out.println("please input:");
        int o = x.nextInt();

        List<Integer> listC = calculator.findNumbersThatGreaterThanX(list1,o);
        System.out.println("Numbers That Greater Than X" + listC);


          /*practice*/
//        list.stream().map(x -> x*x).filter(x -> x > 3).forEach(x -> System.out.println(x));
//        System.out.println(list.listIterator().nextIndex());
//        System.out.println(list.listIterator().next());
//        System.out.println(list.stream().map(x -> x*x).filter(x -> x > 3).count());
//        System.out.println(list.get(0) + list.get(1) + list.get(2));
//        System.out.println(list.contains(4));
//        System.out.println(list.size());

    }
}
