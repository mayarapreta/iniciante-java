package operadorAritmetico;

public class operadoraritmetico {
	
public static int add (int a, int b) {
			return a+b;
		}

	public static void main(String[] args) {
	 
		
		int result = add(4,2); //chama o methodo add
		
		System.out.println(result);
		
		result = add(5,3);
		System.out.println(result);
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(c%b); //resto numero apos a/b
		
		

	}

}
