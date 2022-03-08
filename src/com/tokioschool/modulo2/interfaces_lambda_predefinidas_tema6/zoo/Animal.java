package com.tokioschool.modulo2.interfaces_lambda_predefinidas_tema6.zoo;

public class Animal {

	private String nombre;
	private String descripción;
	private String raza;
	private double peso;
	private double altura;
	private boolean peligroso;
	private String comida;
	private double cantidadComida;
	
	private Animal(String nombre, String descripción, String raza, double peso, double altura, boolean peligroso,
			String comida) {
		this.nombre = nombre;
		this.descripción = descripción;
		this.raza = raza;
		this.peso = peso;
		this.altura = altura;
		this.peligroso = peligroso;
		this.comida = comida;
	}
	
	public Animal() {
		this("", "", "", 0.0, 0.0, false, "");
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripción() {
		return descripción;
	}

	public String getRaza() {
		return raza;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public boolean isPeligroso() {
		return peligroso;
	}

	public void setPeligroso(boolean peligroso) {
		this.peligroso = peligroso;
	}

	public String getComida() {
		return comida;
	}

	public double getCantidadComida() {
		return cantidadComida;
	}

	public void setCantidadComida(double cantidadComida) {
		this.cantidadComida = cantidadComida;
	}
	
	public void marcarComoPeligroso() {
		this.setPeligroso(true);
	}
	
	public void alimentar(double cantidad) {
		cantidadComida += cantidad;
	}
	
	public static Animal of(String nombre, String descripción, String raza, double peso, double altura, boolean peligroso,
			String comida) {
		Animal newAnimal = new Animal(nombre,descripción,raza,peso,altura,peligroso,comida);
		newAnimal.setCantidadComida(0);
		return newAnimal;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
}
