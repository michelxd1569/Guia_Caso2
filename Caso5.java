package com.senati.eti;
import java.util.*;
public class Caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		System.out.println("Precio: ");
		float precio = sc.nextFloat();
		
		float total = cantidad * precio;
		float descuento;
		if (cantidad > 8 ) {
			
			 descuento = 0.1f*total;
			
		
		}
		else {
			
			 descuento = 0;
			
		}
		
		float neto = total - descuento;
		
		System.out.println("------------------");
		System.out.println("  Resultado");
		System.out.println("------------------");
		System.out.println("Importe parcial.........."+total);
		System.out.println("Descuento................"+ descuento);
		System.out.println("Importe neto............."+neto);
		

	}

}
