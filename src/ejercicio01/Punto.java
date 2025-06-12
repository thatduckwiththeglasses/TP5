package ejercicio01;

public class Punto {
	int coordenadaX;
	int coordenadaY;
	
	public Punto(int coorX,int coorY) {
		this.coordenadaX = coorX;
		this.coordenadaY = coorY;
	}
	
	@Override
	public String toString() {
		String coorX_string = String.format("%d",this.coordenadaX);
		String coorY_string = String.format("%d",this.coordenadaY);
		return String.format("%s: %s %s \n%s: %s\n%s: %.2f\n%s: %.2f",
								"Coordenada X: ", coorX_string,
								"Coordenada Y: ", coorY_string);
	}
}
