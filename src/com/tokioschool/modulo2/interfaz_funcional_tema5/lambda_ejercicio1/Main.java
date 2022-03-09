package com.tokioschool.modulo2.interfaz_funcional_tema5.lambda_ejercicio1;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		int [] arrayNumber = {0,1,2,3,4,5};
		for (int number : arrayNumber) {
			System.out.printf("\nEl factorial de %d es %d",number,factorial(number));
		}
	}

	private static int factorial(int number) {
		Function<Integer, Integer> function = element -> (element==0) ? 1 : element * factorial(number - 1);
		return function.apply(number);
	}

}
