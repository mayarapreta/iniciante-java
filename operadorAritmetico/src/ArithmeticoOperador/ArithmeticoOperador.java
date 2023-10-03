package ArithmeticoOperador;

public class ArithmeticoOperador {

		public static int add(int a,int b) {
			return a+b;
		}
		public static int sub(int a, int b) {
			return a-b;
		}
         public static int multiply(int a,int b) {
        	 return a*b;
         }
		public static int divide(int a, int b) {
			return a/b;
		}
	
		public static void main(String[] args) {
			
			int result = add(4,2); //chame o methodo add
			
			System.out.println(result); //2
			
			result = sub(4,2); //chame o metodo subtracao
			
			System.out.println(result);//2
			
			result = multiply(4,2); // chame o metodo multiply
			
			System.out.println(result);//8
			
			result = divide(4,2);
		 System.out.println(result) ;//2 chame o metodo divide
}
}