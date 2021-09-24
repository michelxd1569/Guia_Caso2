package com.senati.eti;

import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Trabajador: ");
		String nombre = sc.nextLine();
		System.out.print("Horas Trabajadas: ");
		float horastra = sc.nextFloat();
	
		System.out.print("Tarifa por hora: ");
		float preciohora = sc.nextFloat();
		System.out.print("Minutos de Tardanza: ");
		float tardanza = sc.nextFloat();
	
		float importe = horastra * preciohora;
		float porcentaje = horastra*100/70;
		String txt = "";
		float bono;
		float descuento;
	
		if (tardanza >15)
		
			descuento = importe * 0.03f;
	
		else
			descuento = 0;
	
		if ((horastra>60)) 
		
			bono = importe*0.13f;
			
		
		else
		
			bono = importe * 0.04f;
			
		if (horastra>70){
			
			txt ="Meta alcanzada:  ";
		}
		else
			
			txt ="Meta no alcanzada:  ";
		
			
		System.out.println("Trabajador: " + nombre);
		System.out.println("Horas Trabajadas: " + horastra);
		System.out.println("Tarifa hora: " + preciohora );
		System.out.println("importe: " + importe);
		System.out.println("Bono: " + bono );
		System.out.println("El descuento es: " + descuento);
		System.out.println(txt + porcentaje +"%" );
	

	}

}
