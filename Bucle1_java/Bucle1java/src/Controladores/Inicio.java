package Controladores;

import java.util.Scanner;

public class Inicio 
{
	
	public static void main(String[] args) 
	 {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int primer_pago;
		 int multiplicador = 2;
		 int meses;
		 int i;
		 
		 System.out.println("Dame un mes:");
		 meses = sc.nextInt();
		 System.out.println("Cuanto pagas el primer mes:");
		 primer_pago = sc.nextInt();
		 
		 int pagoTotal = primer_pago;
		 
		 System.out.println("El mes 1 pagas " + primer_pago);
		 
		for(i = 2; i<=meses; i++) 
			
		 {
			pagoTotal = multiplicador * pagoTotal;
				 
		    System.out.println("El mes " + i + " pagas " + pagoTotal);			 
			 
		 }
		 
		 
		 
		 
	 }  
}
	 
