package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			if (num1 < num2) {
				
				x = "El primer Numero es Menor";		
			}
			else {
				
				x="El Segundo N?mero es Menor";
			}
			
		}
		System.out.println("Resultado");
		System.out.println("-----------------------");
		System.out.println("Mensaje:-    " + x);	
		
	}

}
