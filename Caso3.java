package com.senati.eti;
import java.util.*;
public class Caso3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el Primer N?mero: ");
		int num1 = sc.nextInt();
		System.out.print("Ingrese el Segundo N?mero: ");
		int num2 = sc.nextInt();
		
		String x;
		
		if (num1 == num2) {
			
			x = "Los numero son iguales";
			
		}
		
		else {
			
			
			if (num1 > num2) {
				
				x = "El primer Numero es Mayor";
				
				
			}
			else {
				
				x="El Segundo N?mero es Mayor";
			}
			
		}
		
		System.out.println("Resultado");
		System.out.println("-----------------------");
		System.out.println("Mensaje:-    " + x);	
		
	}

		
}
