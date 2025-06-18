package ejercicio01;

//Subclase Rectangulo
public class Rectangulo extends Figura {
	protected long LadoMayor;
	protected long LadoMenor;
	//No estoy seguro si deberia dejarlo como entero o hacerlo "double"

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
		return String.format("%s \n %s: %s\n %s: %s\n %s: %s\n %s: %d\n %s: %d",//Define formato
				"Tipo de Figura: Rectangulo",
				"Nombre", this.nombre,
				"Punto Medio", this.puntomedio.toString(),
				"Color", this.color,
				"Lado Mayor", this.LadoMayor,
				"Lado Menor", this.LadoMenor);	
	}
	
	//Metodo para obtener el Area del Rectangulo
	public long GetArea() {
		return this.LadoMenor * this.LadoMayor;
	}
	
	//Metodo para obtener el Perimetro del Rectangulo
	public long GetPerimetro() {
		return (2 * this.LadoMenor) + (2 * this.LadoMayor);
	}
	
	//Metodo para cambiar el tamaño del rectangulo
	public void SetSize(double factor) {
		if (factor > 0) {
			this.LadoMayor = Math.round(this.LadoMayor * factor);//Se redondea para poder guardar el nuevo tamaño del rectangulo
			this.LadoMenor = Math.round(this.LadoMenor * factor);
		} else if (factor < 0) {
			this.LadoMayor = Math.round(this.LadoMayor * (factor * -1));//Si ocurre que se ingresa un valor negativo, 
			this.LadoMenor = Math.round(this.LadoMenor * (factor * -1));//el resultado sera el mismo
		} else {
			this.LadoMayor = 1;//Si el valor es 0 se resetea el tamaño a 1
			this.LadoMenor = 1;
		}
	}
}
