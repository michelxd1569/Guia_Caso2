package com.senati.eti;
import java.util.*;
public class Caso14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Alumno.......: ");
		String alumno = sc.nextLine();
		System.out.print("Carrera [DS - RC - DG]");
		String carrera = sc.nextLine();
		System.out.print("Turno [M - T - N]");
		String turno = sc.nextLine();
		
		String nombre_carrera= "";
		int monto;
		String nombre_turno = "";
		float dscto;
		switch (carrera) {
		
		
		case "DS":
			nombre_carrera= "Desarrollo de software";
			monto = 1500;
			break;
			
		case "RC":
			nombre_carrera= "Redes y Conectividad";
			monto = 1400;
			
			break;
			
		case "DG":
			nombre_carrera= " Diseño Grafico";
			monto = 1400;
			break;
		default:
			nombre_carrera= "Desconocido";
			monto = 0;
			
				
			
		}
		
		switch (turno) {
		
		case "M":
			nombre_turno = "Mañana";
			dscto = 0.1f * monto;
			break;
		case "T":
			
			nombre_turno = "Tarde";
			dscto = 0.2f * monto;
			break;
		case "N":
			nombre_turno= "Noche";
			dscto = 0.15f * monto;
			break;
		default:
			dscto = 0;
			
			
		
		}
		
		float total_sol = monto - dscto;
		float total_dol = total_sol /4;
		
		
		System.out.println("-------------------");
		System.out.println( " RESULTADO");
		System.out.println("--------------------");
		System.out.println();
		System.out.println("El alumno.............: "  + alumno);
		System.out.println("El monto................: " + monto);
		System.out.println("Nombre de la Carrera:   " + nombre_carrera);
		System.out.println("Descuento...............: " + dscto);
		System.out.println("Turno.................: " + nombre_turno);
		System.out.println("Total en Soles............: "+ "s/"+total_sol );
		System.out.println("Total en Dolares........:  " + "$/"+total_dol);

	}

}
