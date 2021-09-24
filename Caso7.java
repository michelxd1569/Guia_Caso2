package com.senati.eti;
import java.util.*;
public class Caso7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese sueldo");
		float sueldo = sc.nextFloat();
		float inpuesto = 0;
		if (sueldo <=1500)
			
			inpuesto = 0.03f* sueldo;
		else if ((3000>= sueldo) &&(sueldo>=1501)  )
			
			inpuesto = 0.08f * sueldo;
		else if (sueldo>3001)
			
			inpuesto = 0.12f*sueldo;
		
		System.out.println("-----------------------");
		System.out.println(" RESULTADO");
		System.out.println("-----------------------");
		
		System.out.println("El sueldo es de " + sueldo + " Su inpuesto será " + inpuesto);
		
		
		
		

	}

}
