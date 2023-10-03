package Ex5_Tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("TABUADA: ");
		int tabuada = scan.nextInt();
		
System.out.println("Tabuada: " + tabuada);

for( int i = 0; i <= 10 ; i++) {

	System.out.println(tabuada + "x" + i+ "=" + (tabuada*i) );
};
	}

}
