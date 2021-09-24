package com.senati.eti;
import java.util.*;
public class Caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sueldo;
		float impuesto;
		System.out.print("Ingrese Sueldo:");
		sueldo = sc.nextInt();
		
		if (sueldo > 2800)
			
			impuesto = sueldo * 0.05f;
		else
			
			impuesto = sueldo * 0.02f;
		
		System.out.println("----------------------");
		System.out.println(" Resultado");
		System.out.println("----------------------");
		
		System.out.println("Impuesto Calculado " + impuesto);
		

	}

}
