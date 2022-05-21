package com.coderbyte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Podaj typy w formacie typ1 -> typ2");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] types = input.split(" -> ");
        String[] typesOne = types[0].split(" ");
        String[] typesTwo = types[1].split(" ");
        Pokemon first = new Pokemon(typesOne);
        Pokemon second = new Pokemon(typesTwo);

        first.getTypes();
        second.getTypes();

        System.out.println(typesOne[0]);
        System.out.println(typesOne[1]);
        System.out.println(typesTwo[0]);
    }
}
