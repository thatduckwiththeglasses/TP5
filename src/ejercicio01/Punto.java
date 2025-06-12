package ejercicio01;


//Clase Punto que utiliza en la clase Figura
public class Punto {
	int coordenadaX;
	int coordenadaY;
	
//Constructor de la clase Punto
	public Punto(int coorX,int coorY) {
		this.coordenadaX = coorX;
		this.coordenadaY = coorY;
	}
	
	
//metodo toString sobreescrito para la clase Punto: devuelve una lista de las coordenadas
	@Override
	public String toString() {
		String coorX_string = String.format("%d",this.coordenadaX);
		String coorY_string = String.format("%d",this.coordenadaY);
		return String.format("%s: %s %s \n%s: %s\n%s: %.2f\n%s: %.2f",
								"Coordenada X: ", coorX_string,
								"Coordenada Y: ", coorY_string);
	}
}
