package _03_interfaces._04_basico.animales;

/**
 * Si heredamos de una clase que tiene métodos abstractos, tenemos
 * 3 opciones:
 * 1- Declarar la clase como abstracta, está opción la podemos hacer
 * en caso de que NO sepamos como implementar los métodos abstractos
 * 2- Implementar los métodos abstractos, en este debemos de saber
 * hacerlo
 * 3- Declarar la clase como abstracta e implementar sus métodos
 */
public abstract class Pez extends Animal{
	private int numeroAletas;

	@Override
	public void comer(Object o) {
		if(o instanceof Alga) {
			Alga alga = (Alga)o;
			double pesoAumentar = alga.getPeso() * 0.10;
			this.setPeso(this.getPeso() + pesoAumentar);
			System.out.println("Soy un/una " + this.getClass().getSimpleName() + " de nombre "
					+ this.getNombre() + " y voy a comerme "
					+ "un alga ñam ñam ñam :) :)");
		}else {
			System.out.println("PUAJ!! Eso no me gusta :(");
		}
		
	}

	public int getNumeroAletas() {
		return numeroAletas;
	}

	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}

	@Override
	public String toString() {
		return "Pez [numeroAletas=" + numeroAletas + ", getSexo()=" + getSexo() + ", getPeso()=" + getPeso()
				+ ", getEdad()=" + getEdad() + ", getNombre()=" + getNombre() + "]";
	}

	@Override
	public void moverseLento() {
		double movimiento = 200 - (getPeso() * 0.10) + (25 * numeroAletas);
		System.out.println("Soy un Pez y me muevo " + movimiento);
		
	}

	@Override
	public void moverseRapido() {
		double movimiento = 200 - (getPeso() * 0.10) + (50 * numeroAletas);
		System.out.println("Soy un Pez y me muevo " + movimiento);
	}
	
	
}
