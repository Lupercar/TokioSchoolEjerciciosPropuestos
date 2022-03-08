package com.tokioschool.modulo2.interfaces_lambda_predefinidas_tema6.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		System.out.println("Zoo");
		Animal perro1 = Animal.of("Perro1", "un perro", "chiguagua", 0.75, 0.20, false, "golosinas");
		Animal perro2 = Animal.of("Perro2", "un perro", "Pitbull", 15.3, 1.20, true, "chiguagua");
		Animal caballo = Animal.of("Caballo1", "un caballo", "arabe", 30, 2.20, false, "hierva");
		Animal oso = Animal.of("Oso", "un oso", "bestia_parda", 100, 2.50, true, "todo lo que pille");

		Animal[] array = { perro1, perro2, caballo, oso };
		List<Animal> animals = new ArrayList<>(Arrays.asList(array));
		
//		Elimina todos los animales peligrosos
		System.out.println("Animales Origen son peligrosos?:");
		animals.forEach(animal -> System.out.println(animal.getNombre() + ", peligroso?: " + animal.isPeligroso()));
		
		System.out.println("\nElimino animales peligrosos: ");
		List<Animal> animalesNoPeligrosos = animals.stream()
				.filter(animal -> !animal.isPeligroso())
				.peek(animal -> System.out.print(" " + animal.getNombre() + ", peligroso?: " + animal.isPeligroso() + "\n"))
				.collect(Collectors.toList());
		
		
//		Lista todos los nombres de los animales
		List<String> animalsNombres = animals.stream()
				.map(Animal::getNombre)
				.collect(Collectors.toList());
		System.out.print("\n\nNombre de todos los animales " + animalsNombres);
		
//		Poner 10 Kg de comida a cada animal
//		https://stackify.com/streams-guide-java-8/
		System.out.println("\n\nKg comida animales Original:");
		animals.forEach(animal -> System.out.println(animal.getNombre() + ", cantidad_comida= " + animal.getCantidadComida()));
		
		System.out.println("\nKg comida animales add 10kg:");
		List<Animal> poner10KgComida = animals.stream()
				.peek(animal -> animal.alimentar(10.0))
				.peek(animal -> System.out.println(animal.getNombre() + ", cantidad_comida= " + animal.getCantidadComida()))
				.collect(Collectors.toList());
	}

}
