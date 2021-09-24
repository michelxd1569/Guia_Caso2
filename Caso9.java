package com.senati.eti;
import java.util.*;
public class Caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombre del Alumno: ");
		String nombre = sc.nextLine();
		System.out.print("Nota 1 [0 - 20] : ");
		int nota1 = sc.nextInt();
		
		System.out.print("Nota 2 [0 - 20] : ");
		int nota2 = sc.nextInt();
		System.out.print("Asistencia [0 - 12]: ");
		int asistencia = sc.nextInt();
		
		
		float promedio = nota1*0.3f + nota2*0.7f;
		float porcentaje = asistencia / 12f*100f;
		String estado = null;
		estado = "desaprobado";
		if ((promedio >= 13) &&	 (porcentaje >=70))
			
			estado = "aprobado";
		
		
		
		System.out.println("---------------");
		System.out.println("  RESULTADO ");
		System.out.println("---------------");
		System.out.println("Alumno.....  "+ nombre);
		System.out.println("Promedio....." + promedio);
		System.out.println("Asitencia.... "+ porcentaje + "%");
		System.out.println("Estado....... " + estado);
		
	}

}
