package com.senati.eti;
import java.util.*;
public class Caso13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Primer Número: ");
		float numero1 = sc.nextFloat();
		System.out.print("Segundo Número: ");
		float numero2 = sc.nextFloat();
		System.out.println("Operacion [1 - 6]");
		int operacion = sc.nextInt();
		
		float resultado = 0;
		String c= "";
		
		
		switch (operacion) {
		
		case 1:
			resultado = numero1 + numero2;
			c = "Suma";
			break;
		case 2: 
			resultado = numero1 - numero2;
			c = "Resta";
			break;
		case 3:
			resultado = numero1 * numero2;
			c = "Producto";
			break;
		case 4:
			
			if (numero2 != 0)
				resultado = numero1 / numero2;
				
			else{
				resultado = 0000;
				
				c = "Indefinido";
				
			}
			break;
		case 5:
			
			
			if (numero2 != 0)
				resultado = numero1 % numero2;
				c= "Resto";
			
			if (numero2 == 0) {
					
				resultado = 0;
				c = "indefinido";
				}

				
				
			break;
				
			
		case 6:
			resultado = (numero1 + numero2 )/2;
			
			c = "Promedio";
			break;
			
		default:
			resultado = 0;
			
		
		
		}
		
		System.out.println("---------------------");
		System.out.println("-----RESULTADO-------");
		System.out.println("---------------------");
		System.out.println("Numero 1: " + numero1);
		System.out.println("Numero 2: " + numero2);
		System.out.println("Operacion: "+ c);
		System.out.println("Resultado: "+ resultado);
		
		
		
		

	}

}
