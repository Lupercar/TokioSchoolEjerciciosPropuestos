package com.tokioschool.modulo2.stream_lambda_y_referencia_a_metodos_tema7.ciudades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		Ciudad Madrid = Ciudad.of("Madrid", "Madrid", 3_233_000);
		Ciudad Leganes = Ciudad.of("Leganes", "Madrid", 188_425);
		Ciudad AlcalaDeHenares = Ciudad.of("Alcala de Henares", "Madrid", 195_982);
		Ciudad Barcelona = Ciudad.of("Barcelona", "Barcelona", 1_620_000);
		Ciudad Sabadell  = Ciudad.of("Sabadell ", "Barcelona", 211_734);
		Ciudad LHospitaletDeLlobregat  = Ciudad.of("L'Hospitalet de Llobregat ", "Barcelona", 261_068);
		Ciudad Gandia  = Ciudad.of("Gandia", "Valencia", 73_829);
		Ciudad Jativa  = Ciudad.of("Játiva", "Valencia", 29_045);
		
		Ciudad [] array = {Madrid,Leganes,AlcalaDeHenares,Barcelona,Sabadell,LHospitaletDeLlobregat,Gandia,Jativa};
		List<Ciudad> ciudades = new ArrayList<>(Arrays.asList(array));
		
//		1.Numero de ciudades en total
		long numeroCiudades = ciudades.stream().count();
		System.out.printf("Hay %d ciudades en total.", numeroCiudades);	
				
//		2.¿Cuántas ciudades de 'Madrid' tienen más de 1000 habitantes?
		Predicate<Ciudad> madridAndMayor1000 = city -> city.getHabitantes() > 1000 
				&& city.getProvincia().equalsIgnoreCase("madrid");
		long numeroCiudadesEnMadrid_Mas_1000 = ciudades.stream()
				.filter(madridAndMayor1000)
				.count();
		System.out.printf("\nHay %d ciudades en Madrid con mas de 1000 habitantes son: ",numeroCiudadesEnMadrid_Mas_1000);
		ciudades.stream()
		.filter(madridAndMayor1000)
		.forEach(city -> System.out.print(city.getNombre() + ", "));
		
//		3. ¿De qué provincias son las ciudades? = como se llama las provincias?
		System.out.print("\nComo se llaman las provincias de esas ciudades: ");
		ciudades.stream()
		.map(Ciudad::getProvincia)
		.distinct()
		.forEach( element -> System.out.print(element + ", "));
		
//		4. ¿Cuántas provincias diferentes son las ciudades?
		long numberProvince = ciudades.stream()
				.map(Ciudad::getProvincia)
				.distinct()
				.count();
		System.out.printf("\nNumero de provincias diferentes: %d", numberProvince);
		
		
	}

}
