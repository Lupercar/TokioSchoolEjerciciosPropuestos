package com.tokioschool.modulo2.interfaz_funcional_tema5.funcionesl_ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		System.out.println("Dogs y funciones");
		Dog boi = new Dog("boi", 30, 6);
		Dog tyri = new Dog("tyri", 40, 12);
		Dog charis = new Dog("charis", 120, 7);

		System.out.println(boi);
		
		Dog [] array = {boi,tyri,charis};
		List<Dog> dogs = new ArrayList<>(Arrays.asList(array));
		
		System.out.println("\nUsing Function lambda getName with Dog object:");
		Function<Dog, String> getName = element -> element.getName();
		dogs.forEach( dog -> System.out.print(getName.apply(dog) + " "));
		
		System.out.println("\nUsing Function lambda getInitial with String");
		Function<String, Character> getInitial = element -> element.charAt(0);
		dogs.forEach( dog -> System.out.print(getInitial.apply(dog.getName()) + " "));
		
//	    http://tutorials.jenkov.com/java-functional-programming/functional-composition.html#predicate-composition
		System.out.println("\nUsing Function lambda andThen()");
		Function<Dog, Character> getNameThenGetInitial = getName.andThen(getInitial);
		System.out.println(getName.andThen(getInitial).apply(boi));
		System.out.println(getNameThenGetInitial.apply(tyri));
		System.out.println(getNameThenGetInitial.apply(charis));
		
		System.out.println("\nUsing Function lambda compose()");
		System.out.println(getInitial.compose(getName).apply(boi));
		System.out.println(getInitial.compose(getName).apply(tyri));
		System.out.println(getInitial.compose(getName).apply(charis));
	}

}
