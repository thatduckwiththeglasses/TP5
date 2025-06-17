package ejercicio01;

public class Elipse extends Figura{
	protected int RadioMenor;
	protected int RadioMayor;
	
	public Elipse(String nombre,int coordenadaX,int coordenadaY,String color,int radiomenor,int radiomayor) {
		
		super(nombre,coordenadaX,coordenadaY,color);
		this.RadioMayor = radiomayor;
		this.RadioMenor = radiomenor;
	}
}
