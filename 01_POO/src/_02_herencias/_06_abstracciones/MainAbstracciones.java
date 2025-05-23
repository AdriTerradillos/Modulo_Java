package _02_herencias._06_abstracciones;

import java.util.ArrayList;
import java.util.List;

public class MainAbstracciones {

	public static void main(String[] args) {
		//var numero1 = 7;
		//Animal animal = new Animal(); --> son abstractos, no puedo hacer objetos
		//Pez pez = new Pez(); --> igual que Animal.
		Animal t = new Trucha(); //Animal existe como clase abstracta y no estoy creando ningún objeto Animal, lo estoy creando Trucha
		//Pez t = new Trucha(); --> Esto se puede hacer es lo mismo que con animal.
		
		
		//Animal es superClass de Pez, y Pez superClass de Trucha
		// puedo guardar Trucha como Pez, o como Animal
		// si quiero que sea Trucha de nuevo --> casteo (Trucha)
		
		t.setNombre("Robustiana");
		t.setPeso(2.2);
		t.setSexo(Sexo.NO_BINARIO);
		t.setEdad(1);
		//Normalmente cuando creamos un objeto usaremos
		//una referencia de su propio tipo, ya que si no
		//debemos de hacer un casting
		//t.setNumeroAletas() --> no puedo añadir aletas porque Animal no lo tiene
		Trucha trucha = (Trucha)t;
		trucha.setNumeroAletas(2); //ya he hecho el casteo, ya es Trucha, ya puedo meter aletas
		
		Cangrejo c = new Cangrejo();
		c.setNombre("Sebastian");
		c.setEdad(4);
		c.setNumeroAletas(0); //este hereda de Pez y el resto vienen de Animal
		c.setPeso(0.2);
		c.setSexo(Sexo.HERMAFRODITA);
		
		Leon l = new Leon();
		l.setNombre("Simba");
		l.setEdad(5);
		l.setPeso(180);
		l.setSexo(Sexo.MASCULINO);
		
		Tiburon tiburon = new Tiburon();
		tiburon.setNombre("Lorenzo");
		tiburon.setPeso(480);
		tiburon.setEdad(3);
		tiburon.setSexo(Sexo.FLUIDO);
		tiburon.setNumeroAletas(7);
		
		//Siempre es mejor utilizar referencias interfaces 
		//para apuntar a objetos
		List<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(trucha);
		listaAnimales.add(c);
		listaAnimales.add(l);
		listaAnimales.add(tiburon);
		
		//Vamos a dar de comer a los animales mediante el polimorfismo
		Animal alimento1 = new Leon();
		alimento1.setPeso(1);
		alimento1.setNombre("comida");
		
		for(Animal animal : listaAnimales) {
			//aplicamos polimorfismo, cada objeto llamará a 
			//su método comer
			animal.comer(alimento1);
			System.out.println("Mi nuevo peso: " + animal.getPeso());
		}
		System.out.println("---------------------");
		Alga alga = new Alga();
		alga.setPeso(0.8);
		//Con una función lambda
		listaAnimales.forEach(v -> {
			v.comer(alga);
			System.out.println("Mi nuevo peso: " + v.getPeso());
		});
		
		System.out.println("-----------");
		//Decimos al leon que se coma a si mismo
		l.comer(l);
		System.out.println("Mi nuevo peso: " + l.getPeso());
		tiburon.comer(tiburon);
		System.out.println("Mi nuevo peso: " + tiburon.getPeso());
		
		//Clases anonimas
		//---------------
		//Son aquellas clases que se instancian a partir de una
		//clase abstracta o una interfaz. Se crean al mismo tiempo
		//una clase que extiende de la clase abstracta y el objeto
		
		//Este tipo de clases se utilizan cuando solo se va a crear
		//un objeto de este tipo de clase
		
		//La clase anomima se crea a partir de la abstracta
		Animal piguino = new Animal() {
			
			//Estmos creando una clase y un objeto al mismo tiempo
			//y la clase NO tiene nombre (es anómima)
			@Override
			public void comer(Object o) {
				if(o instanceof Trucha) {
					System.out.println("Me como la trucha");
				}else {
					System.out.println("Solo como truchas");
				}
				
			}
			//Es una clase de usar y tirar
		};
		
		listaAnimales.add(piguino);
		for(Animal animal : listaAnimales) {
			//aplicamos polimorfismo, cada objeto llamará a 
			//su método comer
			animal.comer(alimento1);
			System.out.println("Mi nuevo peso: " + animal.getPeso());
		}
	}

}
