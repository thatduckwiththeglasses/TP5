package ejercicio01;

public class Rectangulo extends Figura {
	
	public Rectangulo(String nombre,int coordenadaX,int coordenadaY,String color) {
		this.nombre = nombre;
		this.puntomedio = new Punto(coordenadaX,coordenadaY);
	}
	
}
