package ejercicio01;


//Clase Punto que utiliza en la clase Figura
public class Punto {
	Integer coordenadaX;
	Integer coordenadaY;
	
//Constructor de la clase Punto
	public Punto(int coorX,int coorY) {
		this.coordenadaX = coorX;
		this.coordenadaY = coorY;
	}
	
	
//metodo toString sobreescrito para la clase Punto: devuelve una lista de las coordenadas
	@Override
	public String toString() {
		return String.format("%s: %d\n %s: %d", //Esto define el formato que se necesita: "%s" para cadenas; y "%d" para numeros
								"Coordenada X: ", this.coordenadaX ,
								"Coordenada Y: ", this.coordenadaY);
	}
}
