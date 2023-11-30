package _02_02.before;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pear"};
        Integer[] numbers = {1, 5, 7};
        List<String> wordList = copnvertArrayToList(words);
        List<Integer> numbersList = copnvertArrayToList(numbers);
        System.out.println(wordList);
        System.out.println(numbersList);
    }

    private static <T> List<T> copnvertArrayToList(T[] array)
    {
        return Arrays.asList(array);
    }



}
