package ejercicio01;

//Subclase Rectangulo
public class Rectangulo extends Figura {
	protected int LadoMayor;
	protected int LadoMenor;
	

	//Constructor de la subclase Rectangulo
	public Rectangulo(String nombre ,int coordenadaX,int coordenadaY ,String color , int ladoM,int ladom) {
		
		//Se llama al constructor de la clase Figura
		super(nombre,coordenadaX,coordenadaY,color);
		//y despues se define las variables de la subclase Rectangulo
		this.LadoMayor = ladoM;
		this.LadoMenor = ladom;
	}
	
	
	//no estoy seguro si dejar estos metodos XD
	public void setLadoMayor(int ladoM) {
		this.LadoMayor = ladoM;
	}
	
	public void setLadoMenor(int ladoMenor) {
		this.LadoMayor = ladoMenor;
	}
	
	
	
	@Override 
	public String toString() {//Devuelve una descripcion de los atributos de la subclase Rectangulo
		return String.format("%s: %s %s \n%s: %s\n%s: %.2f\n%s: %.2f",
				"Tipo de Figura: Rectangulo",
				"Nombre: ", this.nombre,
				"Punto Medio: ", this.puntomedio.toString(),
				"Color: ", this.color,
				"Lado Mayor: ", this.LadoMayor,
				"Lado Menor: ", this.LadoMenor);	
	}
	
	//Metodo para obtener el Area del Rectangulo
	public int GetArea() {
		return this.LadoMenor * this.LadoMayor;
	}
	
	//Metodo para obtener el Perimetro del Rectangulo
	public int GetPerimetro() {
		return (2 * this.LadoMenor) + (2 * this.LadoMayor);
	}
	
	//PARA HACER: codear un metodo para cambiar el tamaño del rectangulo
}
