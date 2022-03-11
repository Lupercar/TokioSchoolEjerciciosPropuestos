package com.tokioschool.modulo2.stream_lambda_y_referencia_a_metodos_tema7.ciudades;

public class Ciudad {

	private String nombre;
	private String provincia;
	private int habitantes;

	private Ciudad(String nombre, String provincia, int habitantes) {
		this.nombre = nombre;
		this.provincia = provincia;
		this.habitantes = habitantes;
	}
	
	public static Ciudad of(String nombre, String provincia, int habitantes) {
		return new Ciudad(nombre, provincia, habitantes);
	}

	private Ciudad() {
		this("", "", 0);
	}

	public String getNombre() {
		return nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public int getHabitantes() {
		return habitantes;
	}
	
	@Override
	public int hashCode() {
		return this.getNombre().hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Ciudades)) {
			return false;
		}

		Ciudades ciudad = (Ciudades) obj;
		return ciudad.getNombre().equals(this.getNombre()) && ciudad.getProvincia().equals(this.getProvincia());
	}

	@Override
	public String toString() {
		return this.getNombre().concat("-").concat(this.getProvincia());
	}
}
