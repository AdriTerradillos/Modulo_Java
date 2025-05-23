package Ejercicios._01_Clases.Solucion.primerosejercicios;

/*
 * =================
 * =   ENUNCIADO   =
 * =================
 * 
 * Crea una clase Coche. Indica características como cantidad de ventanas,
 * cantidad de puertas, cantidad de ruedas, velocidad, si está circulando o no,
 * si está frenado o no, si está en marcha o no.
 * 
 * Piensa cómo hacer el constructor del vehículo.
 * 
 * Necesitarás hacer varios métodos y pensar qué atributos son valores numéricos
 * y los que no.
 * 
 * Haz un método acelerar que incremente la velocidad del coche en 5km/h
 * Haz un método decelerar que disminuya la velocidad del coche en 5km/h
 * Haz un método arrancar para que se ponga en marca el vehículo.
 * 
 * En el método main, hecho en una clase a parte, tienes que probar con que el coche
 * acelere, decelere, arranque y frene.
 * 
 * Atención: si el coche no está en marcha no va a poder acelerar ni decelerar.
 */

public class Coche {
	//Atributos mínimos del enunciado
	private int cantidadVentanas;
	private int cantidadPuertas;
	private int cantidadRuedas;
	private int velocidad;
	private boolean estaCirculando;
	private boolean estaFrenado;
	private boolean estaEnMarcha;
	
	//Atributos extra: no los menciona el enunciado pero para poder identificarlos
	//Se les puede dar una marca, un modelo, un año...
	//También otros atributos extra como velocidad máxima
	private String marca;
	private String modelo;
	private int anio;
	private int velocidadMax;
	
	//Constructor
	public Coche(int cantidadVentanas, int cantidadPuertas, int cantidadRuedas, int velocidadMax, String marca, String modelo, int anio) {
		this.cantidadVentanas = cantidadVentanas;
		this.cantidadPuertas = cantidadPuertas;
		this.cantidadRuedas = cantidadRuedas;
		this.velocidad = 0;
		this.velocidadMax = velocidadMax;
		this.estaCirculando = false;
		this.estaFrenado = true;
		this.estaEnMarcha = false;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	
	

}
