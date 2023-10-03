package Ex6_Fatorial;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);

		/*  entrada da expresao*/
		
		System.out.println("Fatoral: ");
		int fatorial = scan.nextInt();
		
		int multiplicacao = 1;
		
		/*resolver a solicao*/
		
		System.out.println(fatorial + "! =");
		
		for(int i = fatorial ; i >= 1 ; i--) {
		
			multiplicacao = multiplicacao * i ;
		}
		System.out.println(multiplicacao);
	}

}
