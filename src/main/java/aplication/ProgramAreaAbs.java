package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CircleAbs;
import entities.RectangleAbs;
import entities.Shape;
import entities.enums.Color;

public class ProgramAreaAbs {

	public static void main(String[] args) {
	  
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> lista = new ArrayList<>();//Instancia lista de formas
		
		System.out.print("Enter the number of shapes: ");//Le o numero de figuras
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			//Verifica se é retângulo ou circulo
			if (ch == 'r') {//Retangulo
			   System.out.print("Width: ");
			   double width = sc.nextDouble();
			   System.out.print("Height: ");
			   double height = sc.nextDouble();//Le dados do retangulo
			   lista.add(new RectangleAbs(color, width, height));//Armazena na lista
			}   
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();//Le raio da circunferencia
				lista.add(new CircleAbs(color, radius));//Armazena na lista
			}			
			
		}
		//Imprime cabecalho caso de teste
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		//Percorre a lista calculando e imprimindo a area das figuras
		for (Shape shape : lista) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
		
	}

}

