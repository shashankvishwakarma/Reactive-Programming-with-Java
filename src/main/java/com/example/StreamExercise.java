package com.example;

public class StreamExercise {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()
        System.out.println("Print all numbers in the intNumbersStream stream");
        StreamSources.intNumbersStream()
                .forEach(System.out::println);

        System.out.println("Print numbers from intNumbersStream that are less than 5");
        StreamSources.intNumbersStream()
                .filter(num -> num < 5)
                .forEach(System.out::println);

        System.out.println("Print the second and third numbers in intNumbersStream that's greater than 5");
        StreamSources.intNumbersStream()
                .filter(number -> number > 5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("Print the first number in intNumbersStream that's greater than 5.");
        System.out.println("If nothing is found, print -1");
        Integer value = StreamSources.intNumbersStream()
                .filter(number -> number > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(value);

        System.out.println("Print first names of all users in userStream");
        // TODO: Write code here

        System.out.println("Print first names in userStream for users that have IDs from number stream");
        // TODO: Write code here

    }

}
