package com.senati.eti;
import java.util.*;
public class Caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un número: ");
		String x;
		
		int num1 = sc.nextInt();
		
		if ((num1%2)==0) {
			
			x = "El numero es Par";
		}
		else   {
			
			x = "El número es Inpar";
		}
		
		System.out.println(x);
		
	}

}
