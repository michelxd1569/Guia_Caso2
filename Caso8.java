package com.senati.eti;
import java.util.*;
public class Caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = null;
		
		System.out.print("EScriba una nota de 0 a 20: ");
		int nota = sc.nextInt();
		
		if (nota <= 7)
			
			text = "sin Palabras";
		
		else if ((nota < 10) && (nota >=8) )
			
			text = "Malo";
		
		else if ((nota <=14 )&&(nota>=11))
			
			text = "Regular";
		else if ((nota <=17)&& (nota >=15))
			text = "Notable";
		else if ((nota <=20)&&(nota >=18))
			
			text = "Excelente";
		
		System.out.println("---------------------");
		System.out.println("Resultado");
		System.out.println("---------------------");
		System.out.println("La nota es: " + text);
		
	}

}
