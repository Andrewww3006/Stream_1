package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("a1","a2","a3","a8"));
        System.out.println("кол-во вхождений а1 в коллекцию: " + strings.stream().filter(x-> x.equals("a1")).count());
        Optional<String> first = strings.stream().findFirst();
        System.out.println("первый элемент коллекции: " + first.orElse("0"));
        Optional<String> last = strings.stream().reduce((x, y)->y);
        System.out.println("последний элемент коллекции: " + last.orElse("empty"));
        long count = strings.stream().count();
        Optional<String> last2 = strings.stream().skip(count-1).findFirst();
        System.out.println("последний элемент коллекции: " + last2.orElse("empty"));


    }
}
