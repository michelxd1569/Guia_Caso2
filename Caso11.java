package com.senati.eti;
import java.util.*;
public class Caso11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número [1 - 7]:  ");
		int n = sc.nextInt();
		String x = "";
		
		switch (n) 
		{
		
		case 1:
			x ="Domingo";
			break;
		case 2:
			
			x= "Lunes";
			break;
		case 3:
			
			x= "Martes";
			break;
		case 4:
			
			x= "Miecoles";
			break;
		case 5:
			
			x= "Jueves";
			break;
		case 6:
			
			x= "Viernes";
			break;
		case 7:
			x ="Sabado";
			break;
		default:
			x= "No dia";
			
		
		}
		
		System.out.println("---------------");
		System.out.println("Resultado");
		System.out.println("----------------");
		
		System.out.println("Dia de la Semana.....:  " + x);
		
		
			
				
				
		
		
		
		
		
		
		
		
		
		

	}

}
