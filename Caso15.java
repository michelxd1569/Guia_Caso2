package com.senati.eti;
import java.util.*;
public class Caso15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese CLiente: ");
		String cliente = sc.nextLine();
		System.out.print("Ingrese producto [TB - LT - MN - TM]: ");
		String producto = sc.nextLine();
		
		System.out.print("Ingrese Cantidad: ");
		int cantidad = sc.nextInt();
		System.out.print("Ingrese forma de pago [C1 - C2]: ");
		System.out.println("");
		String x = sc.next();
		
		
		
		int precio;
	
		String productos = "";
		float total;
		float descuento=0;
		String forma_pago1 = "";
		float importe=0;
		String esta ="";
		
		switch (producto){
		
		case "TB":
			
			precio = 350;
			importe = precio * cantidad;
			productos = "Tablet";
			break;
			
		case "LT":
			
			precio = 2300;
			importe = precio * cantidad;
			productos="LAptop";
			break;
		case "MN":
			precio = 850;
			importe = precio*cantidad;
			productos ="Monitor";
			break;
		case "TM":
			
			precio = 680;
			importe = precio * cantidad;
			productos = "Impresora";
			break;
		default:
			
			precio =0;
			
		
			
			
		}
		

		
		switch (x) {
		
		
		
		case "C1":
			total = (importe * 0.95f);
			descuento = importe * 0.05f;
			forma_pago1 ="Contado";
			
			esta= "Descuento: ";
			break;
		case "C2":
			
			total = importe * 1.12f;
			descuento = importe * 0.12f;
			forma_pago1= "Credito";
			esta = "Incremento: ";
			break;
		default:
			total = 0;
			
		}
		
		System.out.println("-----------------------");
		System.out.println("--------RECIBO---------");
		System.out.println("----------------------");
		System.out.println("Cliente: "+ cliente);
		System.out.println("Producto: "+ productos);
		System.out.println("Precio: "+ precio);
		System.out.println("Cantidad: "+ cantidad);
		System.out.println("Importe: "+ importe);
		System.out.println("Forma de pago: "+ forma_pago1);
		System.out.println(esta + descuento);
		System.out.println("Total a Pagar: "+ total);
		
		
		
		
	}

}
