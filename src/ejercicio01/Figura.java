package ejercicio01;

public class Figura extends Object {
	String nombre;
	Punto puntomedio;
	String color;
	
	public Figura(String nombre,int coordenadaX,int coordenadaY,String color) {
		this.nombre = nombre;
		this.puntomedio = new Punto(coordenadaX,coordenadaY);
		this.color = color;
	}
	
	public String toString() {
		return String.format("%s: %s %s \n%s: %s\n%s: %.2f\n%s: %.2f",
				"nombre: ", this.nombre,
				"Punto Medio: ", this.puntomedio.toString(),
				"Color:", this.color);	
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void cambiarColor(String color) {
		this.color = color;
	}
	
	public void moverForma(int cX, int cY) {
		this.puntomedio = new Punto(cX,cY);
	}
}
