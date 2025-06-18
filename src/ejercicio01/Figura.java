package ejercicio01;


//clase Figura
public class Figura extends Object {//Solo porque el ejercicio decia que toString era heredado de la clase objeto
	protected String nombre;					// no estoy seguro todavia si funciona igual sin el "extends Object"
	protected Punto puntomedio;
	protected String color;
	//Queria dejarlos en "private"
	//pero no podia usar las variables para la funcion toString de rectangulo
	//asi que solo quedaran en "protected"
	
//Constructor de la clase
	public Figura(String nombre,int coordenadaX,int coordenadaY,String color) {
		this.nombre = nombre;
		this.puntomedio = new Punto(coordenadaX,coordenadaY);
		this.color = color;
	}

	
@Override //Se supone que esto asegura que el metodo de esta clase sobreescriba el metodo de clase objeto 
	public String toString() {//Devuelve una descripcion de los atributos de la clase Figura 
		return String.format("%s: %s\n %s: %s\n %s: %s",//Define el formato
				"Nombre", this.nombre,
				"Punto Medio", this.puntomedio.toString(),
				"Color", this.color);	
	}

//Revisa el color de la figura
	public String getColor() {
		return this.color;
	}

//Cambia el color de la figura
	public void cambiarColor(String color) {
		this.color = color;
	}

//Cambia el punto medio de la figura
	public void moverForma(int cX, int cY) {
		this.puntomedio = new Punto(cX,cY);
	}
}
