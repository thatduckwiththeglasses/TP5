package ejercicio01;

import java.util.Scanner;

public class PruebaObjetos1 {

	//crea una "variable especial"(? para poder tomar input del usuario
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese que tipo de figura quiere crear: ");
		String e = in.nextLine();
		e.toLowerCase();
		System.out.println("Ingrese Nombre: ");
		String nombre = in.nextLine();
		System.out.println("Ingrese Color: ");
		String color = in.nextLine();
		if (e.equals("rectangulo")){
			Rectangulo rectangulo = new Rectangulo(nombre,0,0,color,1,2);
			System.out.println(rectangulo.toString());
			System.out.println("Ingrese factor para cambiar tamaño: ");
			Integer factor = Integer.parseInt(in.nextLine());
			rectangulo.SetSize(factor);
			System.out.println(rectangulo.toString());
		}
	}

}
