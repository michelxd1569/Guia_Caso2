package com.senati.eti;
import java.util.*;
public class Caso12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombre del Empleado: ");
		String empleado = sc.nextLine();
		System.out.println("Nivel [1 - 4]");
		int nivel = sc.nextInt();
		System.out.println("Sueldo: ");
		float sueldo = sc.nextFloat();
		
		
		float valor_inc,n ;
		
		switch (nivel) {
		
		case 1:
			valor_inc = 0.045f;
			n = 4.5f;
			break;
		case 2:
			valor_inc =0.06f;
			n = 6;
			break;
		case 3:
			valor_inc = 0.085f;
			n = 8.5f;
			break;
		case 4 :
			
			valor_inc = 0.11f;
			n = 11;
			break;
		default:
			valor_inc = 0;
			n = 0;
			
				
			
			
		}
		
		float nuevo_sueldo = sueldo + sueldo*valor_inc;
		
		System.out.println("-----------------");
		System.out.println(" RESULTADO ");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("Empleado: "+ empleado);
		System.out.println("Nivel: " + nivel);
		System.out.println("Sueldo: " + sueldo);
		System.out.println("Incremento: " + n+"%");
		System.out.println("Nuevo sueldo: " + nuevo_sueldo);
		
		
	}

}
